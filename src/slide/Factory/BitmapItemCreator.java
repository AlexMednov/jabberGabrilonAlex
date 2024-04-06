package slide.Factory;

import slide.SlideItem;
import slide.BitmapItem;

public class BitmapItemCreator extends SlideItemCreator {
    @Override
    public SlideItem createSlideItem() {
        return new BitmapItem();
    }
}