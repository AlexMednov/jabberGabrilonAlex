package slide;

import java.awt.*;
import java.awt.image.ImageObserver;

public class VideoSlide extends BaseSlide {
    private String videoPath;
    private String videoXAxis;
    private String videoYAxis;
    private int width;
    private int height;

    public VideoSlide(String videoPath, String videoXAxis, String videoYAxis, int width, int height) {
        this.videoPath = videoPath;
        this.videoXAxis = videoXAxis;
        this.videoYAxis = videoYAxis;
        this.width = width;
        this.height = height;
    }

    public String getVideoPath() {
        return videoPath;
    }

    public void setVideoPath(String videoPath) {
        this.videoPath = videoPath;
    }

    public String getVideoXAxis() {
        return videoXAxis;
    }

    public void setVideoXAxis(String videoXAxis) {
        this.videoXAxis = videoXAxis;
    }

    public String getVideoYAxis() {
        return videoYAxis;
    }

    public void setVideoYAxis(String videoYAxis) {
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

    //THIS IS NOT DONE!!!!! IT NEEDS TO HAVE ACTUAL CODE!!!!
}
