package presentation;

import slide.Slide;

import java.awt.Color;
import java.awt.Font;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Rectangle;
import javax.swing.JComponent;
import javax.swing.JFrame;

public class SlideViewerComponent extends JComponent {
		
	private Slide slide; // current slide
	private Font labelFont; // font for labels
	private Presentation presentation; // the presentation
	private JFrame frame;
	
	private static final long serialVersionUID = 227L;
	
	private static final Color BGCOLOR = Color.white;
	private static final Color COLOR = Color.black;
	private static final String FONT_NAME = "Dialog";
	private static final int FONT_STYLE = Font.BOLD;
	private static final int FONT_HEIGHT = 10;
	private static final int XPOS = 1100;
	private static final int YPOS = 20;

	public SlideViewerComponent(Presentation presentation, JFrame frame) {
		setBackground(BGCOLOR); 
		this.presentation = presentation;
		this.frame = frame;
		labelFont = new Font(FONT_NAME, FONT_STYLE, FONT_HEIGHT);
	}

	public Dimension getPreferredSize() {
		return new Dimension(Slide.WIDTH, Slide.HEIGHT);
	}

	public Slide getSlide()
	{
		return slide;
	}

	public void setSlide(Slide slide)
	{
		this.slide = slide;
	}

	public Font getLabelFont()
	{
		return labelFont;
	}

	public void setLabelFont(Font labelFont)
	{
		this.labelFont = labelFont;
	}

	public Presentation getPresentation()
	{
		return presentation;
	}

	public void setPresentation(Presentation presentation)
	{
		this.presentation = presentation;
	}

	public JFrame getFrame()
	{
		return frame;
	}

	public void setFrame(JFrame frame)
	{
		this.frame = frame;
	}

	public void update(Presentation presentation, Slide slide) {
		if (slide == null) {
			repaint();
			return;
		}
		this.presentation = presentation;
		this.slide = slide;
		repaint();
		frame.setTitle(presentation.getTitle());
	}

// draw the slide
	public void paintComponent(Graphics g) {
		g.setColor(BGCOLOR);
		g.fillRect(0, 0, getSize().width, getSize().height);
		if (presentation.getSlideNumber() < 0 || slide == null) {
			return;
		}
		g.setFont(labelFont);
		g.setColor(COLOR);
		g.drawString("slide.Slide " + (1 + presentation.getSlideNumber()) + " of " +
                 presentation.getSize(), XPOS, YPOS);
		Rectangle area = new Rectangle(0, YPOS, getWidth(), (getHeight() - YPOS));
		slide.draw(g, area, this);
	}
}
