package factory;

import slide.AnimationWrapper;
import slide.VideoWrapper;
import slide.Slide;

public abstract class Builder {
    public abstract VideoWrapper videoCreatorSetup();
    public abstract AnimationWrapper animationCreatorSetup();
    public abstract Slide baselineCreatorSetup();
}

