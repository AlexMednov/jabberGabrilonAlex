package slide;

import java.awt.*;
import java.awt.image.ImageObserver;
import java.util.Vector;

public class AnimationSlide implements BaseSlide {
    private String animationPath;

    private String title; // title is saved separately

    private Vector<SlideItem> items;

    public AnimationSlide(String title, Vector<SlideItem> items, String animationPath) {
        this.animationPath = animationPath;
        this.title = title;
        this.items = items;
    }

    public Vector<SlideItem> getItems() {
        return items;
    }

    public void setItems(Vector<SlideItem> items) {
        this.items = items;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAnimationPath() {
        return animationPath;
    }

    public void setAnimationPath(String animationPath) {
        this.animationPath = animationPath;
    }

    @Override
    public void draw(Graphics graphics, Rectangle rectangle, ImageObserver imageObserver) {

    }

    @Override
    public void append(int level, String message) {

    }

    @Override
    public void append(SlideItem anItem) {

    }
}
