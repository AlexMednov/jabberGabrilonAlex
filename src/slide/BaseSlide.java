package slide;

import java.awt.*;
import java.awt.image.ImageObserver;
import java.util.Vector;

interface BaseSlide {
    public abstract void draw(Graphics graphics, Rectangle rectangle, ImageObserver imageObserver);

    public abstract void append(int level, String message);
    public abstract void append(SlideItem anItem);
}
