package slide;

import org.junit.jupiter.api.Test;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
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
    @Test
    void gettingBufferedImage_expectNoException_validImageTestingWidth() throws IOException {
        BufferedImage bufferedImageActual = ImageIO.read(new File("img/JabberPoint.jpg"));

        BitmapItem bitmapItem = new BitmapItem(1, "img/JabberPoint.jpg");

        assertEquals(bufferedImageActual.getWidth(), bitmapItem.getBufferedImage().getWidth());
    }

    @Test
    void gettingBufferedImage_expectNoException_validImageTestingHeight() throws IOException {
        BufferedImage bufferedImageActual = ImageIO.read(new File("img/JabberPoint.jpg"));

        BitmapItem bitmapItem = new BitmapItem(1, "img/JabberPoint.jpg");

        assertEquals(bufferedImageActual.getHeight(), bitmapItem.getBufferedImage().getHeight());
    }

    @Test
    void gettingBufferedImage_expectNoException_validImageTestingType() throws IOException {
        BufferedImage bufferedImageActual = ImageIO.read(new File("img/JabberPoint.jpg"));

        BitmapItem bitmapItem = new BitmapItem(1, "img/JabberPoint.jpg");

        assertEquals(bufferedImageActual.getType(), bitmapItem.getBufferedImage().getType());
    }

    @Test
    void gettingImageName_expectNoExceptions_validImage() throws IOException{
        BitmapItem bitmapItem = new BitmapItem(1, "img/JabberPoint.jpg");

        assertEquals("JabberPoint.jpg", bitmapItem.getName());
    }

    @Test
    void gettingImageName_expectNoExceptions_validImage2() throws IOException{
        BitmapItem bitmapItem = new BitmapItem(1, "img/dog.jpg");

        assertEquals("dog.jpg", bitmapItem.getName());
    }

    @Test
    void stringifyingBitMap_expectNoException_validCreation() throws IOException {
        BitmapItem bitmapItem = new BitmapItem(1, "img/dog.jpg");

        assertEquals("slide.BitmapItem[1,img/dog.jpg]", bitmapItem.toString());
    }
    @Test
    void stringifyingBitMap_expectNoException_validCreation2() throws IOException {
        BitmapItem bitmapItem = new BitmapItem(2, "img/JabberPoint.jpg");

        assertEquals("slide.BitmapItem[2,img/JabberPoint.jpg]", bitmapItem.toString());
    }
}