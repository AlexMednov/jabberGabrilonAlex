package style;

import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class StyleTest {
    @Test
    void creatingStyleTest_expectNoException_comparingIndent(){
        Style style = new Style(10, Color.blue, 10, 10);

        assertEquals(style.getIndent(), 10);
    }

    @Test
    void creatingStyleTest_expectNoException_comparingColor(){
        Style style = new Style(10, Color.blue, 10, 10);

        assertEquals(style.getColor(), Color.blue);
    }

    @Test
    void creatingStyleTest_expectNoException_comparingFontSize(){
        Style style = new Style(10, Color.blue, 15, 10);

        assertEquals(style.getFontSize(), 15);
    }

    @Test
    void creatingStyleTest_expectNoException_comparingLeading(){
        Style style = new Style(10, Color.blue, 10, 20);

        assertEquals(style.getLeading(), 20);
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
}