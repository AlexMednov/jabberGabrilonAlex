package slide;

import org.junit.jupiter.api.Test;

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
}