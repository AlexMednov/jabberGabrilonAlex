package builder;

import slide.AnimationSlide;
import slide.SlideItem;
import slide.VideoSlide;
import slide.Slide;

import java.util.Vector;

interface Builder {
    public abstract void videoCreatorSetup(String videoPath, int videoXAxis, int videoYAxis, int width, int height);
    public abstract void animationCreatorSetup(String title, Vector<SlideItem> items, String animationPath);
    public abstract void baselineCreatorSetup(String title, Vector<SlideItem> items);
}

