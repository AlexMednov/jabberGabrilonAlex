package slide;

import java.awt.*;
import java.awt.image.ImageObserver;
import java.util.Vector;

public class AnimationSlide implements BaseSlide {
    private String animationPath;

    private String title; // title is saved separately

    protected Vector<SlideItem> items;

    @Override
    public void draw(Graphics graphics, Rectangle rectangle, ImageObserver imageObserver) {

    }

    @Override
    public void append(int level, String message) {

    }

    @Override
    public void append(SlideItem anItem) {

    }
    //THIS IS NOTE DONE IT NEEDS TO BE IMPLEMENTED WITH ACTUAL CODE!!!!
}
