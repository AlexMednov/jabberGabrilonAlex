package slide.Factory;

import slide.SlideItem;
import slide.TextItem;

public class TextItemCreator extends SlideItemCreator {
    //Creator for text items
    public TextItemCreator() {
    }

    @Override
    public SlideItem createSlideItem(int level, String text) {
        return new TextItem(level, text);
    }
}