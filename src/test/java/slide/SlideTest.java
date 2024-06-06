package slide;

import org.junit.jupiter.api.Test;
import slide.Factory.SlideItemCreator;
import slide.Factory.TextItemCreator;
import style.enums.Level;

import java.io.IOException;
import java.util.Vector;

import static org.junit.jupiter.api.Assertions.*;

class SlideTest {
    @Test
    void creatingEmptySlide_expectNoExceptions_comparingTitle(){
        Slide slide = new Slide();

        assertEquals("Default title", slide.getTitle());
    }

    @Test
    void creatingEmptySlide_expectNoException_comparingItems(){
        Slide slide = new Slide();

        Vector<SlideItem> items = new Vector<>();

        assertEquals(items, slide.getSlideItems());
    }

    @Test
    void creatingEmptySlideWithAlternativeConstructor_expectNoException_comparingTitle(){
        Vector<SlideItem> items = new Vector<>();

        Slide slide = new Slide("", items);

        assertEquals("Default title", slide.getTitle());
    }

    @Test
    void creatingNoneEmptySlide_expectNoException_comparingTitle(){
        Vector<SlideItem> items = new Vector<>();

        Slide slide = new Slide("Test title", items);

        assertEquals("Test title", slide.getTitle());
    }

    @Test
    void creatingNoneEmptySlide_expectNoException_comparingItems1() throws IOException {
        SlideItemCreator textItemCreator = new TextItemCreator();

        Vector<SlideItem> items = new Vector<>();

        items.add(textItemCreator.createSlideItem(Level.BASE.getValue(), "The Java presentation.Presentation Tool"));

        Slide slide = new Slide("Test title", items);

        assertEquals(items.get(0), slide.getSlideItems().get(0));
    }

    @Test
    void creatingNoneEmptySlide_expectNoException_comparingItems2() throws IOException {
        SlideItemCreator textItemCreator = new TextItemCreator();

        Vector<SlideItem> items = new Vector<>();

        items.add(textItemCreator.createSlideItem(Level.BASE.getValue(), "The Java presentation.Presentation Tool"));
        items.add(textItemCreator.createSlideItem(Level.BASE.getValue(), "sdfsdfsf"));
        items.add(textItemCreator.createSlideItem(Level.BASE.getValue(), "ANSWER"));

        Slide slide = new Slide("Test title", items);

        assertEquals(items.get(2), slide.getSlideItems().get(2));
    }

    @Test
    void settingTitle_expectNoException_comparingTitle() throws IOException {
        SlideItemCreator textItemCreator = new TextItemCreator();

        Vector<SlideItem> items = new Vector<>();

        items.add(textItemCreator.createSlideItem(Level.BASE.getValue(), "The Java presentation.Presentation Tool"));
        items.add(textItemCreator.createSlideItem(Level.BASE.getValue(), "sdfsdfsf"));
        items.add(textItemCreator.createSlideItem(Level.BASE.getValue(), "ANSWER"));

        Slide slide = new Slide("Test title", items);

        slide.setTitle("Different title");

        assertEquals("Different title", slide.getTitle());
    }

    @Test
    void gettingNumberOfElements_expectNoException_comparingSize() throws IOException {
        SlideItemCreator textItemCreator = new TextItemCreator();

        Vector<SlideItem> items = new Vector<>();

        items.add(textItemCreator.createSlideItem(Level.BASE.getValue(), "The Java presentation.Presentation Tool"));
        items.add(textItemCreator.createSlideItem(Level.BASE.getValue(), "sdfsdfsf"));
        items.add(textItemCreator.createSlideItem(Level.BASE.getValue(), "ANSWER"));

        Slide slide = new Slide("Test title", items);

        assertEquals(3, slide.getNumberOfItems());
    }

    @Test
    void appendingAsAClass_expectNoException_comparingLevel() throws IOException {
        SlideItemCreator textItemCreator = new TextItemCreator();

        Vector<SlideItem> items = new Vector<>();

        items.add(textItemCreator.createSlideItem(Level.BASE.getValue(), "The Java presentation.Presentation Tool"));
        items.add(textItemCreator.createSlideItem(Level.BASE.getValue(), "sdfsdfsf"));
        items.add(textItemCreator.createSlideItem(Level.BASE.getValue(), "ANSWER"));

        Slide slide = new Slide("Test title", items);

        SlideItem newSlideItem = textItemCreator.createSlideItem(Level.MED.getValue(), "A string");

        slide.append(newSlideItem);

        assertEquals(newSlideItem.getLevel(), slide.getSlideItems().get(slide.getNumberOfItems()-1).getLevel());
    }

    @Test
    void appendingAsAnItem_expectNoException_comparingLevel() throws IOException {
        SlideItemCreator textItemCreator = new TextItemCreator();

        Vector<SlideItem> items = new Vector<>();

        items.add(textItemCreator.createSlideItem(Level.BASE.getValue(), "The Java presentation.Presentation Tool"));
        items.add(textItemCreator.createSlideItem(Level.BASE.getValue(), "sdfsdfsf"));
        items.add(textItemCreator.createSlideItem(Level.BASE.getValue(), "ANSWER"));

        Slide slide = new Slide("Test title", items);

        slide.append(Level.BASE.getValue(), "Message");

        assertEquals(Level.BASE.getValue(), slide.getSlideItems().get(slide.getNumberOfItems()-1).getLevel());
    }

    @Test
    void settingItems_expectNoException_comparingLevel() throws IOException {
        SlideItemCreator textItemCreator = new TextItemCreator();

        Vector<SlideItem> items = new Vector<>();

        Vector<SlideItem> newItems = new Vector<>();

        items.add(textItemCreator.createSlideItem(Level.BASE.getValue(), "The Java presentation.Presentation Tool"));
        newItems.add(textItemCreator.createSlideItem(Level.BASE.getValue(), "sdfsdfsf"));
        newItems.add(textItemCreator.createSlideItem(Level.BASE.getValue(), "ANSWER"));

        Slide slide = new Slide("Test title", items);

        slide.setSlideItems(newItems);

        assertEquals(newItems.get(1).getLevel(), slide.getSlideItems().get(1).getLevel());
    }
}