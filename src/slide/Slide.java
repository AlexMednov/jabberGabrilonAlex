package slide;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.ImageObserver;
import java.util.Vector;

import style.Style;

/** <p>A slide. This class has a drawing functionality.</p>
 * @author Ian F. Darwin, ian@darwinsys.com, Gert Florijn, Sylvia Stuurman
 * @version 1.1 2002/12/17 Gert Florijn
 * @version 1.2 2003/11/19 Sylvia Stuurman
 * @version 1.3 2004/08/17 Sylvia Stuurman
 * @version 1.4 2007/07/16 Sylvia Stuurman
 * @version 1.5 2010/03/03 Sylvia Stuurman
 * @version 1.6 2014/05/16 Sylvia Stuurman
 */

public class Slide {
	public static final int WIDTH = 1200;
	public static final int HEIGHT = 800;
	protected String title; // title is saved separately
	protected Vector<SlideItem> items; // slide items are saved in a Vector

	// give the title of the slide
	public String getTitle() {
		return title;
	}

	// change the title of the slide
	public void setTitle(String newTitle) {
		title = newTitle;
	}

	// give all SlideItems in a Vector
	public Vector<SlideItem> getSlideItems() {
		return items;
	}

	public void setSlideItems(Vector<SlideItem> slideItems) {
		this.items = slideItems;
	}

	// give the size of the slide.Slide
	public int getSize() {
		return items.size();
	}

	public Slide() {
		super();
		items = new Vector<>();
	}

	// Add a slide item
	public void append(SlideItem anItem) {
		items.addElement(anItem);
	}

	// Create slide.TextItem of String, and add the slide.TextItem
	public void append(int level, String message) {
		append(new TextItem(level, message));
	}

	// draw the slide
	public void draw(Graphics graphics, Rectangle rectangle, ImageObserver imageObserver) {
		float scale = getScale(rectangle);
	    int y = rectangle.y;
	// Title is handled separately
	    SlideItem slideItem = new TextItem(0, this.getTitle());
	    Style style = Style.getStyle(slideItem.getLevel());
	    slideItem.draw(rectangle.x, y, scale, graphics, style, imageObserver);
	    y += slideItem.getBoundingBox(graphics, imageObserver, scale, style).height;
	    for (int number=0; number<getSize(); number++) {
	      slideItem = getSlideItems().elementAt(number);
	      style = Style.getStyle(slideItem.getLevel());
	      slideItem.draw(rectangle.x, y, scale, graphics, style, imageObserver);
	      y += slideItem.getBoundingBox(graphics, imageObserver, scale, style).height;
	    }
	  }

	// Give the scale for drawing
	private float getScale(Rectangle area) {
		return Math.min(((float)area.width) / ((float)WIDTH), ((float)area.height) / ((float)HEIGHT));
	}
}