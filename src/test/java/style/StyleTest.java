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
}