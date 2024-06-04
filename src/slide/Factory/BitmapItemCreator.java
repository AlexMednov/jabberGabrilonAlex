package slide.Factory;

import slide.SlideItem;
import slide.BitmapItem;

import java.io.IOException;

public class BitmapItemCreator extends SlideItemCreator {
    public BitmapItemCreator() {
    }

    @Override
    public SlideItem createSlideItem(int level, String text) throws IOException {
        return new BitmapItem(level, text);
    }
}