package slide.Factory;

import slide.SlideItem;
import slide.BitmapItem;

public class BitmapItemCreator extends SlideItemCreator {
    public BitmapItemCreator() {
    }

    @Override
    public SlideItem createSlideItem(int level, String secondParam)
    {
        return new BitmapItem(level, secondParam);
    }
}