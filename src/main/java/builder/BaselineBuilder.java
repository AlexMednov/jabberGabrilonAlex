package builder;

import slide.*;

import java.util.Vector;

public class BaselineBuilder implements Builder {
    private BaseSlide result;

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

    @Override
    public BaseSlide getResult() {
        return result;
    }
}
