package slide;

import java.awt.*;
import java.awt.image.ImageObserver;
import java.util.Vector;

public abstract class BaseSlide {
    public static final int WIDTH = 1200;
    public static final int HEIGHT = 800;

    protected String title; // title is saved separately
    protected Vector<SlideItem> items; // slide items are saved in a Vector

    public abstract void draw(Graphics graphics, Rectangle rectangle, ImageObserver imageObserver);

    public abstract void append(int level, String message);
    public abstract void append(SlideItem anItem);
}
