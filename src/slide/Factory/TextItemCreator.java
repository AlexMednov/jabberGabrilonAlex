package slide.Factory;

import slide.SlideItem;
import slide.TextItem;

public class TextItemCreator extends SlideItemCreator {
    @Override
    public SlideItem createSlideItem() {
        // Default level and text for TextItem
        return new TextItem(0, null);
    }
}