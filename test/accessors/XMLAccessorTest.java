package accessors;

import org.junit.jupiter.api.Test;
import presentation.Presentation;
import slide.Slide;
import slide.SlideItem;
import slide.TextItem;

import java.io.IOException;
import java.util.Vector;

import static org.junit.jupiter.api.Assertions.*;

class XMLAccessorTest {
    @Test
    void savingFile_expectNoException() throws IOException {
        Presentation presentation = new Presentation();

        TextItem textItem = new TextItem(1, "Text here");
        Vector<SlideItem> items = new Vector<>();
        items.add(textItem);
        Slide slide = new Slide("Title of slide", items);
        presentation.append(slide);

        XMLAccessor xmlAccessor = new XMLAccessor();

        assertDoesNotThrow(()->{
            xmlAccessor.saveFile(presentation, "fileName");
        });
    }

    @Test
    void loadingFile_expectNoException() throws IOException {
        Presentation presentation = new Presentation();

        TextItem textItem = new TextItem(1, "Text here");
        Vector<SlideItem> items = new Vector<>();
        items.add(textItem);
        Slide slide = new Slide("Title of slide", items);
        presentation.append(slide);

        XMLAccessor xmlAccessor = new XMLAccessor();

        assertDoesNotThrow(()->{
            xmlAccessor.loadFile(presentation, "fileName");
        });
    }
}