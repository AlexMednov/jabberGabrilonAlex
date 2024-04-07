package slide;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BitmapItemTest {
    @Test
    void creatingNonBitMapItem_expectNoException_comparingLevel(){
        BitmapItem bitmapItem = new BitmapItem(1, "img/finalMeme.jpg");

        assertEquals(1, bitmapItem.getLevel());
    }

    @Test
    void creatingNonBitMapItem_expectNoException_comparingPath(){
        BitmapItem bitmapItem = new BitmapItem(1, "img/finalMeme.jpg");

        assertEquals("img/finalMeme.jpg", bitmapItem.getPath());
    }

}