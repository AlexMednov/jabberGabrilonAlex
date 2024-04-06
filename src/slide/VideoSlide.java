package slide;

import java.awt.*;
import java.awt.image.ImageObserver;
import java.util.Vector;

public class VideoSlide implements BaseSlide {
    private String videoPath;
    private int videoXAxis;
    private int videoYAxis;
    private int width;
    private int height;

    private String title; // title is saved separately

    private Vector<SlideItem> items; // slide items are saved in a Vector

    public VideoSlide(String title, Vector<SlideItem> items, String videoPath, int videoXAxis, int videoYAxis, int width, int height) {
        this.videoPath = videoPath;
        this.videoXAxis = videoXAxis;
        this.videoYAxis = videoYAxis;
        this.width = width;
        this.height = height;
        this.title = title;
        this.items = items;
    }

    public String getVideoPath() {
        return videoPath;
    }

    public void setVideoPath(String videoPath) {
        this.videoPath = videoPath;
    }

    public int getVideoXAxis() {
        return videoXAxis;
    }

    public void setVideoXAxis(int videoXAxis) {
        this.videoXAxis = videoXAxis;
    }

    public int getVideoYAxis() {
        return videoYAxis;
    }

    public void setVideoYAxis(int videoYAxis) {
        this.videoYAxis = videoYAxis;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Vector<SlideItem> getItems() {
        return items;
    }

    public void setItems(Vector<SlideItem> items) {
        this.items = items;
    }

    //THIS IS NOT DONE!!!!! IT NEEDS TO HAVE ACTUAL CODE!!!!
}
