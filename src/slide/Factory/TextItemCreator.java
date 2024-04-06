package slide.Factory;

import slide.SlideItem;
import slide.TextItem;

public class TextItemCreator extends SlideItemCreator {
    @Override
    public SlideItem createSlideItem() {
        return new TextItem();
    }
}