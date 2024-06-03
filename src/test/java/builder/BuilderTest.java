package builder;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class BuilderTest {
    @Test
    void creatingDirectorWithSpecificBuilder_expectNoException_comparingBuilder(){
        Builder builder = new BaselineBuilder();

        Director director = new Director(builder);

        assertEquals(builder, director.getBuilder());
    }

    @Test
    void creatingDirectorWithSpecificBuilderThenChangingBuilder_expectNoException_comparingBuilder(){
        Builder builder = new BaselineBuilder();

        Director director = new Director(builder);

        builder = new AnimationBuilder();
        director.changeBuilder(builder);

        assertEquals(builder, director.getBuilder());
    }
}