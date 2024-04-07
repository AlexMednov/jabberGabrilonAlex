package slide;

import style.Style;

import java.awt.Rectangle;
import java.awt.Graphics;
import java.awt.image.ImageObserver;

public abstract class SlideItem {
	private int level; // level of the slideitem

	public SlideItem(int lev) {
		level = lev;
	}

	public SlideItem() {
		this(0);
	}

// Give the level
	public int getLevel() {
		return level;
	}

	public void setLevel(int level)
	{
		this.level = level;
	}

	// Give the bounding box
	public abstract Rectangle getBoundingBox(Graphics g, ImageObserver observer, float scale, Style myStyle);

// Draw the item
	public abstract void draw(int x, int y, float scale, Graphics g, Style style, ImageObserver observer);
}
