package slide;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class BitmapItemTest {
    @Test
    void creatingBitMapItem_expectNoException_comparingLevel() throws IOException {
        BitmapItem bitmapItem = new BitmapItem(1, "img/JabberPoint.jpg");

        assertEquals(1, bitmapItem.getLevel());
    }

    @Test
    void creatingBitMapItem_expectNoException_comparingPath() throws IOException {
        BitmapItem bitmapItem = new BitmapItem(1, "img/JabberPoint.jpg");

        assertEquals("img/JabberPoint.jpg", bitmapItem.getPath());
    }
    @Test
    void creatingBitMapItem_expectNoException_invalidPath(){
        assertThrows(IOException.class, ()->{
            BitmapItem bitmapItem = new BitmapItem(1, "invalid/path/image.png");
        });
    }
    @Test
    void creatingBitMapItem_expectNoException_invalidPathSecondLevel(){
        assertThrows(IOException.class, ()->{
            BitmapItem bitmapItem = new BitmapItem(2, "invalid/path/image.png");
        });
    }
    @Test
    void changingPathToAnAcceptableOne_expectNoException_validPath() throws IOException {
        BitmapItem bitmapItem = new BitmapItem(1, "img/JabberPoint.jpg");

        assertDoesNotThrow(()->{
            bitmapItem.setPathAndBufferedImage("img/logo-woordmerk_ou.gif");
        });
    }
    @Test
    void changingPathToANonAcceptableOne_expectException_invalidPath() throws IOException {
        BitmapItem bitmapItem = new BitmapItem(1, "img/JabberPoint.jpg");

        assertThrows(IOException.class ,()->{
            bitmapItem.setPathAndBufferedImage("img/invalid/path/image.png");
        });
    }
}