package slide.Factory;

import slide.SlideItem;
import slide.BitmapItem;

public class BitmapItemCreator extends SlideItemCreator {
        @Override
        public SlideItem createSlideItem()
        {
            // Default level for BitmapItem
            return new BitmapItem(0, null);
        }
}