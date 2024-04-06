package builder;

import slide.AnimationSlide;
import slide.Slide;
import slide.SlideItem;
import slide.VideoSlide;

import java.util.Vector;

public class AnimationBuilder implements Builder {
    private AnimationSlide result;
    @Override
    public void videoCreatorSetup(String title, Vector<SlideItem> items, String videoPath, int videoXAxis, int videoYAxis, int width, int height) {
    }

    @Override
    public void animationCreatorSetup(String title, Vector<SlideItem> items, String animationPath) {
        this.result = new AnimationSlide(title, items, animationPath);
    }

    @Override
    public void baselineCreatorSetup(String title, Vector<SlideItem> items) {
    }

    public AnimationSlide getResult() {
        return result;
    }
}
