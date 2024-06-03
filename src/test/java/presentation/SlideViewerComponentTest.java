package presentation;

import org.junit.jupiter.api.Test;

import javax.swing.*;
import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class SlideViewerComponentTest extends JFrame {
    @Test
    void creatingSlideViewerComponent_expectNoException_comparingFont(){
        Font labelFont = new Font("Dialog", Font.BOLD, 10);

        Presentation presentation = new Presentation();

        SlideViewerComponent slideViewerComponent = new SlideViewerComponent(presentation, this);

        assertEquals(labelFont, slideViewerComponent.getLabelFont());
    }
}