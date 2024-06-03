package controllers.keyController;

import org.junit.jupiter.api.Test;
import presentation.Presentation;

import static org.junit.jupiter.api.Assertions.*;

class KeyControllerTest {
    @Test
    void creatingKeyController_expectNoExceptions_comparingPresentation(){
        Presentation presentation = new Presentation();

        KeyController keyController = new KeyController(presentation);

        assertEquals(presentation, keyController.getPresentation());
    }

}