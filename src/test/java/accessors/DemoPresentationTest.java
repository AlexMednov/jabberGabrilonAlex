package accessors;

import org.junit.jupiter.api.Test;
import presentation.Presentation;
import presentation.SlideViewerComponent;

import javax.swing.*;

import static org.junit.jupiter.api.Assertions.*;

class DemoPresentationTest {
    @Test
    void gettingDemoPresentation_expectNoException_doesNotThrow(){
        assertDoesNotThrow(()->{
            Accessor demoPresentation = Accessor.getDemoAccessor();
        });
    }

    @Test
    void loadingDemoPresentation_expectNoException_comparingNumberOfSlides(){
        Accessor demoPresentation = Accessor.getDemoAccessor();
        Presentation presentation = new Presentation();

        assertDoesNotThrow(()->{
            demoPresentation.loadFile(presentation, "DemoPresentation");
        });
    }

    @Test
    void loadingDemoPresentationSavingIt_IllegalStateException(){
        Accessor demoPresentation = Accessor.getDemoAccessor();
        Presentation presentation = new Presentation();

        assertThrows(IllegalStateException.class, ()->{
            demoPresentation.saveFile(presentation, "location/of/file");
        });
    }
}