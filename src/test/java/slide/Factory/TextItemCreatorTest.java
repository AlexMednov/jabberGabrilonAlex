package slide.Factory;

import org.junit.jupiter.api.Test;
import slide.SlideItem;

import static org.junit.jupiter.api.Assertions.*;

class TextItemCreatorTest {
    @Test
    void creatingTextItem_expectNoException_comparingStrings(){
        TextItemCreator textItemCreator = new TextItemCreator();

        SlideItem textItem = textItemCreator.createSlideItem(1, "text");

        assertEquals("slide.TextItem[1,text]", textItem.toString());
    }
}