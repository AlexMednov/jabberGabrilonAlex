package slide.Factory;

import slide.BitmapItem;
import slide.SlideItem;

public class BitmapItemCreator extends SlideItemCreator {
    @Override
    public SlideItem createSlideItem() {
        return new BitmapItem();
    }
}
