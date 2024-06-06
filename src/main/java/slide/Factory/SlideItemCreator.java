package slide.Factory;

import slide.SlideItem;

import java.io.IOException;

public abstract class SlideItemCreator {
    public abstract SlideItem createSlideItem(int level, String string) throws IOException;
}
