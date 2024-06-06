package presentation;

import org.junit.jupiter.api.Test;
import slide.Slide;
import slide.SlideItem;
import slide.TextItem;

import javax.swing.*;
import java.awt.*;
import java.util.Vector;

import static org.junit.jupiter.api.Assertions.*;

class SlideViewerComponentTest extends JFrame {
    @Test
    void creatingSlideViewerComponent_expectNoException_comparingFont(){
        Font labelFont = new Font("Dialog", Font.BOLD, 10);

        Presentation presentation = new Presentation();

        SlideViewerComponent slideViewerComponent = new SlideViewerComponent(presentation, this);

        assertEquals(labelFont, slideViewerComponent.getLabelFont());
    }

    @Test
    void updatingTheSlideViewerComponent_expectNoException(){
        Presentation presentation = new Presentation();

        JFrame jFrame = new JFrame();

        Slide slide = new Slide();

        SlideViewerComponent slideViewerComponent = new SlideViewerComponent(presentation, jFrame);

        assertDoesNotThrow(()->{
            presentation.append(slide);
            slideViewerComponent.update(presentation, slide);
        });
    }

    @Test
    void gettingDimensions_expectNoExceptions_comparingDimensions(){
        Presentation presentation = new Presentation();

        JFrame jFrame = new JFrame();

        SlideViewerComponent slideViewerComponent = new SlideViewerComponent(presentation, jFrame);

        Dimension dimension = slideViewerComponent.getPreferredSize();

        assertEquals(800, dimension.height);
    }

    @Test
    void gettingDimensions_expectNoExceptions_comparingDimensions2(){
        Presentation presentation = new Presentation();

        JFrame jFrame = new JFrame();

        SlideViewerComponent slideViewerComponent = new SlideViewerComponent(presentation, jFrame);

        Dimension dimension = slideViewerComponent.getPreferredSize();

        assertEquals(1200, dimension.width);
    }

    @Test
    void gettingAndSettingSlide_expectNoException_comparingTitles(){
        Presentation presentation = new Presentation();

        JFrame jFrame = new JFrame();

        SlideViewerComponent slideViewerComponent = new SlideViewerComponent(presentation, jFrame);

        Slide slide = new Slide();

        slideViewerComponent.setSlide(slide);

        assertEquals(slide.getTitle(), slideViewerComponent.getSlide().getTitle());
    }

    @Test
    void gettingAndSettingPresentation_expectNoException_comparingTitles(){
        Presentation presentation = new Presentation();

        JFrame jFrame = new JFrame();

        SlideViewerComponent slideViewerComponent = new SlideViewerComponent(presentation, jFrame);

        TextItem textItem = new TextItem(1, "text");

        Vector<SlideItem> slideItems = new Vector<>();
        slideItems.add(textItem);

        Slide slide = new Slide("Title", slideItems);

        presentation.append(slide);

        slideViewerComponent.setPresentation(presentation);

        assertEquals("Title", slideViewerComponent.getPresentation().getSlide(0).getTitle());
    }

    @Test
    void gettingAndSettingJframe_expectNoException(){
        Presentation presentation = new Presentation();

        JFrame jFrame = new JFrame();

        SlideViewerComponent slideViewerComponent = new SlideViewerComponent(presentation, jFrame);

        JFrame newJFrame = new JFrame();

        assertDoesNotThrow(()->{
            slideViewerComponent.setFrame(newJFrame);
        });
    }
}