package slide;

import org.junit.jupiter.api.Test;
import style.Style;
import style.enums.Indent;

import java.awt.*;
import java.text.AttributedString;

import static org.junit.jupiter.api.Assertions.*;

class TextItemTest {
    @Test
    void creatingEmptyTextItem_expectNoException_comparingText(){
        TextItem textItem = new TextItem();

        assertEquals("No Text Given", textItem.getText());
    }

    @Test
    void creatingEmptyTextItem_expectNoException_comparingLevel(){
        TextItem textItem = new TextItem();

        assertEquals(0, textItem.getLevel());
    }

    @Test
    void creatingNotEmptyTextItem_expectNoException_ComparingText(){
        TextItem textItem = new TextItem();

        assertEquals(0, textItem.getLevel());
    }

    @Test
    void creatingNonEmptyTextItem_expectException_InvalidLevel(){
        assertThrows(IllegalArgumentException.class, ()->{
            TextItem textItem = new TextItem(-1,"");
        });
    }

    @Test
    void creatingNonEmptyTextItem_expectNoException_allValid(){
        assertDoesNotThrow(()->{
            TextItem textItem = new TextItem(1,"");
        });
    }

    @Test
    void creatingNonEmptyTextItem_expectNoException_comparingLevel(){
        TextItem textItem = new TextItem(1,"");

        assertEquals(1, textItem.getLevel());
    }

    @Test
    void creatingNonEmptyTextItem_expectNoException_providingEmptyText(){
        TextItem textItem = new TextItem(1,"");

        assertEquals("No Text Given", textItem.getText());
    }

    @Test
    void creatingNonEmptyTextItem_expectNoException_comparingText(){
        TextItem textItem = new TextItem(1,"Text");

        assertEquals("Text", textItem.getText());
    }

    @Test
    void gettingTextItem_expectNoException_comparingStrings(){
        TextItem textItem = new TextItem(1,"Text");

        assertEquals("Text", textItem.getText());
    }

    @Test
    void gettingTextItem_expectNoException_comparingStrings2() {
        TextItem textItem = new TextItem(1, "Different text");

        assertEquals("Different text", textItem.getText());
    }

    @Test
    void settingTextItem_expectNoException_comparingStrings(){
        TextItem textItem = new TextItem(1,"Text");

        textItem.setText("Different text");

        assertEquals("Different text", textItem.getText());
    }

    @Test
    void stringifyingTextItem_expectNoException_comparingStrings(){
        TextItem textItem = new TextItem(1,"Text");

        assertEquals("slide.TextItem[1,Text]", textItem.toString());
    }

    @Test
    void stringifyingTextItem_expectNoException_comparingStrings2(){
        TextItem textItem = new TextItem(1,"Different Text");

        assertEquals("slide.TextItem[1,Different Text]", textItem.toString());
    }

    @Test
    void testingAttributedString_expectNoException_comparing(){
        TextItem textItem = new TextItem(1,"Different Text");

        Style style = new Style(Indent.LOW.getValue(), Color.red, 20, 10);

        AttributedString attributedString = textItem.getAttributedString(style, 0.2f);

        assertEquals("java.text", attributedString.getClass().getPackageName());
    }
}