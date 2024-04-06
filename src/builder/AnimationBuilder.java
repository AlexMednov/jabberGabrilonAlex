package builder;

import slide.AnimationSlide;
import slide.Slide;
import slide.SlideItem;
import slide.VideoSlide;

import java.util.Vector;

public class AnimationBuilder extends Builder
{
    @Override
    public VideoSlide videoCreatorSetup(String videoPath, int videoXAxis, int videoYAxis, int width, int height) {
        return null;
    }

    @Override
    public AnimationSlide animationCreatorSetup(String animationPath) {
        return null;
    }

    @Override
    public Slide baselineCreatorSetup(String title, Vector<SlideItem> items) {
        return null;
    }
}
