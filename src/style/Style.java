package style;

import java.awt.Color;
import java.awt.Font;

public class Style {
	private static Style[] styles; // de styles
	
	private final String FONTNAME = "Helvetica";
	private int indent;
	private Color color;
	private Font font;
	private int fontSize;
	private int leading;

	public Style(int indent, Color color, int fontSize, int leading) {
		setIndent(indent);
		setFontSize(fontSize);
		setLeading(leading);

		this.color = color;
		this.font = new Font(FONTNAME, Font.BOLD, fontSize);
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
		if (indent<0){
			throw new IllegalArgumentException("Invalid indent");
		}
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
		if (fontSize<1){
			throw new IllegalArgumentException("Invalid font");
		}
		this.fontSize = fontSize;
	}

	public int getLeading() {
		return leading;
	}

	public void setLeading(int leading) {
		if (leading<0){
			throw new IllegalArgumentException("Invalid leading");
		}
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
