package slide;

import style.Style;

import java.awt.Rectangle;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.font.TextLayout;
import java.awt.font.TextAttribute;
import java.awt.font.LineBreakMeasurer;
import java.awt.font.FontRenderContext;
import java.awt.geom.Rectangle2D;
import java.awt.image.ImageObserver;
import java.text.AttributedString;
import java.util.List;
import java.util.ArrayList;

public class TextItem extends SlideItem {
	private String text;
	
	private static final String EMPTY_TEXT = "No Text Given";

	// a textitem of level level, with the text string
	public TextItem(int level, String text) {
		super(level);
		if (level<0){
			throw new IllegalArgumentException("Invalid level");
		}
		if (text.isEmpty()){
			this.text = "No Text Given";
		}
		else {
			this.text = text;
		}
	}

	// an empty textitem
	public TextItem() {
		this(0, EMPTY_TEXT);
	}

	// give the text
	public String getText() {
		return this.text;
	}

	public void setText(String text)
	{
		this.text = text;
	}

	// give the AttributedString for the item
	public AttributedString getAttributedString(Style style, float scale) {
		AttributedString attrStr = new AttributedString(getText());
		attrStr.addAttribute(TextAttribute.FONT, style.getFont(scale), 0, text.length());
		return attrStr;
	}


	// give the bounding box of the item
	@Override
	public Rectangle getBoundingBox(Graphics g, ImageObserver observer, float scale, Style myStyle) {
		List<TextLayout> layouts = getLayouts(g, myStyle, scale);
		int xsize = 0;
		int ysize = (int) (myStyle.getLeading() * scale);

		for (TextLayout layout : layouts) {
			Rectangle2D bounds = layout.getBounds();
			if (bounds.getWidth() > xsize) {
				xsize = (int) bounds.getWidth();
			}
			if (bounds.getHeight() > 0) {
				ysize += (int) bounds.getHeight();
			}
			ysize += (int) (layout.getLeading() + layout.getDescent());
		}

		return new Rectangle((int) (myStyle.getIndent() * scale), 0, xsize, ysize);
	}

	// draw the item
	public void draw(int x, int y, float scale, Graphics g, Style myStyle, ImageObserver o) {
		if (text == null || text.isEmpty()) {
			return;
		}
		List<TextLayout> layouts = getLayouts(g, myStyle, scale);
		Point pen = new Point(x + (int)(myStyle.getIndent() * scale),
				y + (int) (myStyle.getLeading() * scale));
		Graphics2D g2d = (Graphics2D)g;
		g2d.setColor(myStyle.getColor());

		for (TextLayout layout : layouts) {
			pen.y += (int) layout.getAscent();
			layout.draw(g2d, pen.x, pen.y);
			pen.y += (int) layout.getDescent();
		}
	}

	private List<TextLayout> getLayouts(Graphics g, Style s, float scale) {
		List<TextLayout> layouts = new ArrayList<>();
		AttributedString attrStr = getAttributedString(s, scale);
    	Graphics2D g2d = (Graphics2D) g;
    	FontRenderContext frc = g2d.getFontRenderContext();
    	LineBreakMeasurer measurer = new LineBreakMeasurer(attrStr.getIterator(), frc);
    	float wrappingWidth = (Slide.WIDTH - s.getIndent()) * scale;
    	while (measurer.getPosition() < getText().length()) {
    		TextLayout layout = measurer.nextLayout(wrappingWidth);
    		layouts.add(layout);
    	}
    	return layouts;
	}

	public String toString() {
		return "slide.TextItem[" + getLevel()+","+getText()+"]";
	}
}
