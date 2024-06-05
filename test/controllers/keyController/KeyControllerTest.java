package controllers.keyController;

import org.junit.jupiter.api.Test;
import presentation.Presentation;
import slide.Slide;
import slide.SlideItem;
import slide.TextItem;

import java.awt.event.KeyEvent;
import java.util.Vector;

import static org.junit.jupiter.api.Assertions.*;

class KeyControllerTest {
    @Test
    void creatingKeyController_expectNoExceptions_comparingPresentation(){
        Presentation presentation = new Presentation();

        KeyController keyController = new KeyController(presentation);

        assertEquals(presentation, keyController.getPresentation());
    }

    @Test
    void settingPresentation_expectNoException_comparingTitlesOfSlides(){
        Presentation presentation = new Presentation();
        Presentation newPresentation = new Presentation();

        TextItem textItem = new TextItem(1, "Text here");
        Vector<SlideItem> items = new Vector<>();
        items.add(textItem);
        Slide slide = new Slide("Title of slide", items);
        newPresentation.append(slide);

        KeyController keyController = new KeyController(presentation);

        keyController.setPresentation(newPresentation);

        assertEquals("Title of slide", keyController.getPresentation().getSlide(0).getTitle());
    }
}