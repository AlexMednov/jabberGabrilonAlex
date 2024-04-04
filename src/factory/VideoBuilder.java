package factory;

import slide.AnimationWrapper;
import slide.Slide;
import slide.VideoWrapper;

public class VideoBuilder extends Builder {

    @Override
    public VideoWrapper videoCreatorSetup() {
        return null;
    }

    @Override
    public AnimationWrapper animationCreatorSetup() {
        return null;
    }

    @Override
    public Slide baselineCreatorSetup() {
        return null;
    }
}
