package builder;

import slide.AnimationSlide;
import slide.Slide;
import slide.SlideItem;
import slide.VideoSlide;

import java.util.Vector;

public class BaselineBuilder implements Builder {
    private Slide result;

    public BaselineBuilder() {
    }

    @Override
    public void videoCreatorSetup(String title, Vector<SlideItem> items, String videoPath, int videoXAxis, int videoYAxis, int width, int height) {
    }

    @Override
    public void animationCreatorSetup(String title, Vector<SlideItem> items, String animationPath) {
    }

    @Override
    public void baselineCreatorSetup(String title, Vector<SlideItem> items) {
        this.result = new Slide(title, items);
    }

    public Slide getResult() {
        return result;
    }
}
