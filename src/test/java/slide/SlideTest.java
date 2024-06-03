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

        assertEquals(items, slide.getItems());
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
}