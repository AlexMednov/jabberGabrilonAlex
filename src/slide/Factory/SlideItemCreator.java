package slide.Factory;

import slide.SlideItem;

public abstract class SlideItemCreator {

    public static SlideItemCreator getSlideItemCreator(String type) {
        if ("Bitmap".equalsIgnoreCase(type)) {
            return new BitmapItemCreator();
        } else if ("Text".equalsIgnoreCase(type)) {
            return new TextItemCreator();
        }
        return null;
    }

    public abstract SlideItem createSlideItem();
}
