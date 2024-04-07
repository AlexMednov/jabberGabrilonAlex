package builder;

import slide.*;

import java.util.Vector;

public class AnimationBuilder implements Builder {
    private BaseSlide result;

    public AnimationBuilder() {
    }

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

    @Override
    public BaseSlide getResult() {
        return result;
    }
}
