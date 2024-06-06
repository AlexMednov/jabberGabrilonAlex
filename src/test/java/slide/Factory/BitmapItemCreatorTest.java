package slide.Factory;

import org.junit.jupiter.api.Test;
import slide.BitmapItem;
import slide.SlideItem;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class BitmapItemCreatorTest {
    @Test
    void creatingBitMap_expectNoException_comparingStrings() throws IOException {
        BitmapItemCreator bitmapItemCreator = new BitmapItemCreator();

        SlideItem bitmapItem = bitmapItemCreator.createSlideItem(1, "img/dog.jpg");

        assertEquals(1, bitmapItem.getLevel());
    }
}