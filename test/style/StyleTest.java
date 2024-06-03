package style;

import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class StyleTest {
    @Test
    void creatingStyleTest_expectNoException_comparingIndent(){
        Style style = new Style(10, Color.blue, 10, 10);

        assertEquals(10, style.getIndent());
    }

    @Test
    void creatingStyleTest_expectNoException_comparingColor(){
        Style style = new Style(10, Color.blue, 10, 10);

        assertEquals(Color.blue, style.getColor());
    }

    @Test
    void creatingStyleTest_expectNoException_comparingFontSize(){
        Style style = new Style(10, Color.blue, 15, 10);

        assertEquals(15, style.getFontSize());
    }

    @Test
    void creatingStyleTest_expectNoException_comparingLeading(){
        Style style = new Style(10, Color.blue, 10, 20);

        assertEquals(20, style.getLeading());
    }

    @Test
    void creatingStyleTest_expectException_invalidIndent() throws IllegalArgumentException{
        assertThrows(IllegalArgumentException.class, ()->{
            Style style = new Style(-10, Color.blue, 10, 20);
        });
    }

    @Test
    void creatingStyleTest_expectException_invalidFontSize() throws IllegalArgumentException{
        assertThrows(IllegalArgumentException.class, ()->{
            Style style = new Style(10, Color.blue, -10, 20);
        });
    }

    @Test
    void creatingStyleTest_expectException_invalidLeading() throws IllegalArgumentException{
        assertThrows(IllegalArgumentException.class, ()->{
            Style style = new Style(10, Color.blue, 10, -20);
        });
    }

    @Test
    void creatingStyleTest_expectNoException_validParamsBorder(){
        assertDoesNotThrow( ()->{
            Style style = new Style(0, Color.blue, 0, 0);
        });
    }

    @Test
    void stringifyingStyle_expectNoException_validCreation(){
        Style style = new Style(10, Color.blue, 10, 10);

        assertEquals("[10,java.awt.Color[r=0,g=0,b=255]; 10 on 10]", style.toString());
    }

    @Test
    void stringifyingStyle_expectNoException_validCreation2(){
        Style style = new Style(1, Color.red, 1, 20);

        assertEquals("[1,java.awt.Color[r=255,g=0,b=0]; 1 on 20]", style.toString());
    }

    @Test
    void settingDifferentLeading_expectNoException_validCreation(){
        Style style = new Style(1, Color.red, 1, 20);

        style.setLeading(1);

        assertEquals(1, style.getLeading());
    }

    @Test
    void settingDifferentLeading_expectNoException_validCreation2(){
        Style style = new Style(1, Color.red, 1, 12);

        style.setLeading(13);

        assertEquals(13, style.getLeading());
    }

    @Test
    void settingInvalidLeading_expectIllegalArgument_validCreation(){
        Style style = new Style(1, Color.red, 1, 12);

        assertThrows(IllegalArgumentException.class, ()->{
            style.setLeading(-1);
        });
    }

    //make sure all functions are tested, not sure of the extent at this moment
}