package presentation;

import org.junit.jupiter.api.Test;
import slide.Slide;
import slide.SlideItem;
import slide.TextItem;

import javax.swing.*;

import java.util.Vector;

import static org.junit.jupiter.api.Assertions.*;

class PresentationTest {
    @Test
    void changingPresentationTitle_expectNoException_comparingStrings(){
        Presentation presentation = new Presentation();
        JFrame jFrame = new JFrame("Title");

        SlideViewerComponent slideViewerComponent = new SlideViewerComponent(presentation, jFrame);

        Presentation newPresentation = new Presentation(slideViewerComponent);

        newPresentation.setTitle("Title");

        assertEquals("Title", newPresentation.getTitle());
    }

    @Test
    void appendingSlide_expectNoException_comparingTitles(){
        Presentation presentation = new Presentation();

        TextItem textItem = new TextItem(1, "textItem");
        Vector<SlideItem> textItems = new Vector<>();
        textItems.add(textItem);

        Slide slide = new Slide("Title", textItems);

        presentation.append(slide);

        assertEquals("Title", presentation.getSlide(0).getTitle());
    }

    @Test
    void changingAndSettingCurrentSlide_expectNoException_comparingSlideNumbers(){
        Presentation presentation = new Presentation();

        presentation.setSlideNumber(10);

        presentation.prevSlide();

        assertEquals(9, presentation.getSlideNumber());
    }

    @Test
    void changingAndSettingCurrentSlide_expectNoException_comparingSlideNumbers2(){
        Presentation presentation = new Presentation();

        TextItem textItem1 = new TextItem(1, "textItem");
        TextItem textItem2 = new TextItem(1, "textItem");
        TextItem textItem3 = new TextItem(1, "textItem");
        TextItem textItem4 = new TextItem(1, "textItem");
        TextItem textItem5 = new TextItem(1, "textItem");
        Vector<SlideItem> textItems = new Vector<>();
        textItems.add(textItem1);
        textItems.add(textItem2);
        textItems.add(textItem3);
        textItems.add(textItem4);
        textItems.add(textItem5);

        Slide slide = new Slide("Title", textItems);

        presentation.append(slide);
        presentation.append(slide);
        presentation.append(slide);
        presentation.append(slide);

        presentation.setSlideNumber(2);

        presentation.nextSlide();

        assertEquals(3, presentation.getSlideNumber());
    }
}