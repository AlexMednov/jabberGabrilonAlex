package builder;

import slide.AnimationSlide;
import slide.Slide;
import slide.SlideItem;
import slide.VideoSlide;

import java.util.Vector;

public class VideoBuilder implements Builder {
    private VideoSlide result;

    public VideoBuilder() {
    }

    @Override
    public void videoCreatorSetup(String title, Vector<SlideItem> items, String videoPath, int videoXAxis, int videoYAxis, int width, int height) {
        this.result = new VideoSlide(title, items, videoPath, videoXAxis, videoYAxis, width, height);
    }

    @Override
    public void animationCreatorSetup(String title, Vector<SlideItem> items, String animationPath) {
    }

    @Override
    public void baselineCreatorSetup(String title, Vector<SlideItem> items) {
    }

    @Override
    public VideoSlide getResult() {
        return result;
    }
}
