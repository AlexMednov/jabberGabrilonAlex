package builder;

import slide.BaseSlide;
import slide.SlideItem;

import java.util.Vector;

public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Builder getBuilder() {
        return builder;
    }

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public void changeBuilder(Builder builder){
        this.builder = builder;
    }

    public BaseSlide make(String title, Vector<SlideItem> items, String animationPath){
        this.builder.animationCreatorSetup(title, items, animationPath);

        return this.builder.getResult();
    }

    public BaseSlide make(String title, Vector<SlideItem> items){
        this.builder.baselineCreatorSetup(title, items);

        return this.builder.getResult();
    }

    public BaseSlide make(String title, Vector<SlideItem> items, String videoPath, int videoXAxis, int videoYAxis, int width, int height){
        this.builder.videoCreatorSetup(title, items, videoPath, videoXAxis, videoYAxis, width, height);

        return this.builder.getResult();
    }
}
