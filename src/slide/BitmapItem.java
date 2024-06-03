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

// level is equal to item-level; name is the name of the file with the Image
	public BitmapItem(int level, String path) throws IOException {
		super(level);
		this.path = path;
		bufferedImage = ImageIO.read(new File(path));
	}

	public String getPath() {
		return path;
	}

	public void setPathAndBufferedImage(String path) throws IOException {
		this.bufferedImage = ImageIO.read(new File(path));
		this.path = path;
	}

	public BufferedImage getBufferedImage()
	{
		return bufferedImage;
	}

	//Need to test buffered image, need to update geting name, need to test rectangle and to string and gering name


// give the filename of the image
	public String getName() {
		String[] splitPath = this.path.split("/");

		return splitPath[splitPath.length-1];
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
		return "slide.BitmapItem[" + getLevel() + "," + this.path + "]";
	}
}
