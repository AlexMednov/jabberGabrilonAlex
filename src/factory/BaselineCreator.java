package factory;

import com.sun.org.apache.bcel.internal.generic.NEW;
import slide.Slide;
import slide.SlideItem;

import java.util.Vector;

public class BaselineCreator extends Creator
{
    @Override
    public Slide create(String title, Vector<SlideItem> items) {
        return null;
    }

    @Override
    public Slide createProduct(String title, Vector<SlideItem> items) {
        return new Slide(items, title);
    }
}
