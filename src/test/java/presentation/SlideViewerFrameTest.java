package presentation;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SlideViewerFrameTest {
    @Test
    void settingUpWindow_expectNoException_makingSureItDoesNotCrash(){
        assertDoesNotThrow(()->{
            Presentation presentation = new Presentation();

            SlideViewerFrame slideViewerFrame = new SlideViewerFrame("Title", presentation);
        });
    }
}