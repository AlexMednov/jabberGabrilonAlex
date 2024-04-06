package builder;

import slide.AnimationSlide;
import slide.SlideItem;
import slide.VideoSlide;
import slide.Slide;

import java.util.Vector;

public abstract class Builder {
    public abstract VideoSlide videoCreatorSetup(String videoPath, int videoXAxis, int videoYAxis, int width, int height);
    public abstract AnimationSlide animationCreatorSetup(String animationPath);
    public abstract Slide baselineCreatorSetup(String title, Vector<SlideItem> items);
}

