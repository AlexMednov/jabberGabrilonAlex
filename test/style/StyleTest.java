package style;

import org.junit.jupiter.api.Test;
import style.enums.Indent;
import style.enums.Leading;
import style.enums.Level;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class StyleTest {
    @Test
    void creatingStyleTest_expectNoException_comparingIndent(){
        Style style = new Style(Indent.LOW.getValue(), Color.blue, 10, Leading.LOW.getValue());

        assertEquals(20, style.getIndent());
    }

    @Test
    void creatingStyleTest_expectNoException_comparingColor(){
        Style style = new Style(Indent.MED.getValue(), Color.red, 10, Leading.MED.getValue());

        assertEquals(Color.red, style.getColor());
    }

    @Test
    void creatingStyleTest_expectNoException_comparingFontSize(){
        Style style = new Style(Indent.HIGH.getValue(), Color.green, 15, Leading.HIGH.getValue());

        assertEquals(15, style.getFontSize());
    }

    @Test
    void creatingStyleTest_expectNoException_comparingLeading(){
        Style style = new Style(Indent.MAX.getValue(), Color.yellow, 10, Leading.MED.getValue());

        assertEquals(20, style.getLeading());
    }

    @Test
    void creatingStyleTest_expectException_invalidIndent() throws IllegalArgumentException{
        assertThrows(IllegalArgumentException.class, ()->{
            Style style = new Style(-10, Color.blue, 10, Leading.MED.getValue());
        });
    }

    @Test
    void creatingStyleTest_expectException_invalidFontSize() throws IllegalArgumentException{
        assertThrows(IllegalArgumentException.class, ()->{
            Style style = new Style(10, Color.blue, -10, Leading.MED.getValue());
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
            Style style = new Style(1, Color.blue, 1, 1);
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

    @Test
    void gettingStylesCheckingLeading_expectNoException_validCreationLevel1(){
        Style.createStyles();

        Style styleLevel1 = new Style(20, Color.blue,  40, 10);

        assertEquals(styleLevel1.getLeading(), Style.getStyle(1).getLeading());
    }

    @Test
    void gettingStylesCheckingIndent_expectNoException_validCreationLevel1(){
        Style.createStyles();

        Style styleLevel1 = new Style(20, Color.blue,  40, 10);

        assertEquals(styleLevel1.getIndent(), Style.getStyle(1).getIndent());
    }

    @Test
    void gettingStylesCheckingColor_expectNoException_validCreationLevel1(){
        Style.createStyles();

        Style styleLevel1 = new Style(20, Color.blue,  40, 10);

        assertEquals(styleLevel1.getColor(), Style.getStyle(Level.BASE.getValue()).getColor());
    }

    @Test
    void gettingStylesCheckingLeading_expectNoException_validCreationLevel2(){
        Style.createStyles();

        Style styleLevel1 = new Style(50, Color.black, 36, 10);

        assertEquals(styleLevel1.getLeading(), Style.getStyle(Level.LOW.getValue()).getLeading());
    }

    @Test
    void gettingStylesCheckingLeading_expectNoException_validCreationLevel3(){
        Style.createStyles();

        Style styleLevel1 = new Style(70, Color.black, 30, 10);

        assertEquals(styleLevel1.getLeading(), Style.getStyle(Level.MED.getValue()).getLeading());
    }
}