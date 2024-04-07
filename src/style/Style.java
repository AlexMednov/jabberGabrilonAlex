package style;

import java.awt.Color;
import java.awt.Font;

public class Style {
	private static Style[] styles; // de styles
	
	private static final String FONTNAME = "Helvetica";
	int indent;
	Color color;
	Font font;
	int fontSize;
	int leading;

	public Style(int indent, Color color, int points, int leading) {
		this.indent = indent;
		this.color = color;
		fontSize = points;
		font = new Font(FONTNAME, Font.BOLD, fontSize);
		this.leading = leading;
	}

	public static Style getStyle(int level) {
		return styles[level];
	}

	public static void setStyles(Style[] styles) {
		Style.styles = styles;
	}

	public int getIndent() {
		return indent;
	}

	public void setIndent(int indent) {
		this.indent = indent;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public Font getFont(float scale) {
		return font.deriveFont(fontSize * scale);
	}

	public void setFont(Font font) {
		this.font = font;
	}

	public int getFontSize() {
		return fontSize;
	}

	public void setFontSize(int fontSize) {
		this.fontSize = fontSize;
	}

	public int getLeading() {
		return leading;
	}

	public void setLeading(int leading) {
		this.leading = leading;
	}

	public static void createStyles() {
		styles = new Style[6];
		// The styles are fixed.
		styles[0] = new Style(0, Color.red,   48, 20);	// style for item-level 0
		styles[1] = new Style(20, Color.blue,  40, 10);	// style for item-level 1
		styles[2] = new Style(50, Color.black, 36, 10);	// style for item-level 2
		styles[3] = new Style(70, Color.black, 30, 10);	// style for item-level 3
		styles[4] = new Style(90, Color.black, 24, 10);	// style for item-level 4
		styles[5] = new Style(90, Color.blue, 40, 20);
	}

	public String toString() {
		return "["+ indent + "," + color + "; " + fontSize + " on " + leading +"]";
	}
}
