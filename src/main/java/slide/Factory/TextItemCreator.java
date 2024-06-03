package slide.Factory;

import slide.SlideItem;
import slide.TextItem;

public class TextItemCreator extends SlideItemCreator {
    public TextItemCreator() {
    }

    @Override
    public SlideItem createSlideItem(int level, String secondParam) {
        return new TextItem(level, secondParam);
    }
}