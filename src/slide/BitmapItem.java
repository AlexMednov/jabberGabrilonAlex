package slide;

import java.awt.Rectangle;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.File;

import javax.imageio.ImageIO;

import java.io.IOException;

import style.Style;

public class BitmapItem extends SlideItem {
  private BufferedImage bufferedImage;
  private String path;
  
  protected static final String FILE = "File ";
  protected static final String NOTFOUND = " not found";

// level is equal to item-level; name is the name of the file with the Image
	public BitmapItem(int level, String path) throws IllegalArgumentException {
		super(level);
		if (level<0){
			throw new IllegalArgumentException("Invalid level");
		}
		this.path = path;
		try {
			bufferedImage = ImageIO.read(new File(this.path));
		}
		catch (IOException e) {
			System.err.println(FILE + this.path + NOTFOUND) ;
		}
	}

	public BufferedImage getBufferedImage()
	{
		return bufferedImage;
	}

	public void setBufferedImage(BufferedImage bufferedImage)
	{
		this.bufferedImage = bufferedImage;
	}

	public String getImageName()
	{
		return path;
	}

	public void setImageName(String imageName)
	{
		this.path = imageName;
	}


// give the filename of the image
	public String getPath() {
		return path;
	}

// give the  bounding box of the image
	@Override
	public Rectangle getBoundingBox(Graphics g, ImageObserver observer, float scale, Style myStyle) {
		return new Rectangle((int) (myStyle.getIndent() * scale), 0,
				(int) (bufferedImage.getWidth(observer) * scale),
				((int) (myStyle.getLeading() * scale)) +
				(int) (bufferedImage.getHeight(observer) * scale));
	}

// draw the image
	public void draw(int x, int y, float scale, Graphics g, Style myStyle, ImageObserver observer) {
		int width = x + (int) (myStyle.getIndent() * scale);
		int height = y + (int) (myStyle.getLeading() * scale);
		g.drawImage(bufferedImage, width, height,(int) (bufferedImage.getWidth(observer)*scale),
                (int) (bufferedImage.getHeight(observer)*scale), observer);
	}

	public String toString() {
		return "slide.BitmapItem[" + getLevel() + "," + path + "]";
	}
}
