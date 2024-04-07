package accessors;

import builder.BaselineBuilder;
import slide.Factory.BitmapItemCreator;
import slide.Factory.SlideItemCreator;
import slide.Factory.TextItemCreator;
import presentation.Presentation;
import slide.SlideItem;
import style.enums.Level;

import java.util.Vector;

/** A built in demo-presentation
 * @author Ian F. Darwin, ian@darwinsys.com, Gert Florijn, Sylvia Stuurman
 * @version 1.1 2002/12/17 Gert Florijn
 * @version 1.2 2003/11/19 Sylvia Stuurman
 * @version 1.3 2004/08/17 Sylvia Stuurman
 * @version 1.4 2007/07/16 Sylvia Stuurman
 * @version 1.5 2010/03/03 Sylvia Stuurman
 * @version 1.6 2014/05/16 Sylvia Stuurman
 */

class DemoPresentation extends Accessor {

	public void loadFile(Presentation presentation, String unusedFilename) {
		BaselineBuilder baselineBuilder = new BaselineBuilder();

		SlideItemCreator textItemCreator = new TextItemCreator();
		SlideItemCreator bitmapItemCreator = new BitmapItemCreator();

		presentation.setTitle("Demo presentation.Presentation");

		Vector<SlideItem> slideItems = new Vector<>();
		slideItems.add(textItemCreator.createSlideItem(Level.BASE.getValue(), "The Java presentation.Presentation Tool"));
		slideItems.add(textItemCreator.createSlideItem(Level.LOW.getValue(), "Copyright (c) 1996-2000: Ian Darwin"));
		slideItems.add(textItemCreator.createSlideItem(Level.LOW.getValue(), "Copyright (c) 2000-now:"));
		slideItems.add(textItemCreator.createSlideItem(Level.LOW.getValue(), "Gert Florijn andn Sylvia Stuurman"));
		slideItems.add(textItemCreator.createSlideItem(Level.HIGH.getValue(), "Starting jabberPoint.JabberPoint without a filename"));
		slideItems.add(textItemCreator.createSlideItem(Level.HIGH.getValue(), "shows this presentation"));
		slideItems.add(textItemCreator.createSlideItem(Level.BASE.getValue(), "Navigate:"));
		slideItems.add(textItemCreator.createSlideItem(Level.MED.getValue(), "Next slide: PgDn or Enter:"));
		slideItems.add(textItemCreator.createSlideItem(Level.MED.getValue(), "Previous slide: PgUp or up-arrow"));
		slideItems.add(textItemCreator.createSlideItem(Level.MED.getValue(), "Quit: q or Q"));

		baselineBuilder.baselineCreatorSetup("jabberPoint.JabberPoint", slideItems);

		presentation.append(baselineBuilder.getResult());


		slideItems = new Vector<>();
		slideItems.add((textItemCreator.createSlideItem(Level.BASE.getValue(), "Level 1")));
		slideItems.add((textItemCreator.createSlideItem(Level.LOW.getValue(), "Level 2")));
		slideItems.add((textItemCreator.createSlideItem(Level.BASE.getValue(), "Again level 1")));
		slideItems.add((textItemCreator.createSlideItem(Level.BASE.getValue(), "Level 1 has style number 1")));
		slideItems.add((textItemCreator.createSlideItem(Level.LOW.getValue(), "Level 2 has style number 2")));
		slideItems.add((textItemCreator.createSlideItem(Level.MED.getValue(), "This is how level 3 looks like")));
		slideItems.add((textItemCreator.createSlideItem(Level.HIGH.getValue(), "And this is level 4")));

		baselineBuilder.baselineCreatorSetup("Demonstration of levels and stijlen", slideItems);

		presentation.append(baselineBuilder.getResult());


		slideItems = new Vector<>();
		slideItems.add(textItemCreator.createSlideItem(Level.BASE.getValue(), "To open a new presentation,"));
		slideItems.add(textItemCreator.createSlideItem(Level.LOW.getValue(), "use File->Open from the menu."));
		slideItems.add(textItemCreator.createSlideItem(Level.BASE.getValue(), " "));
		slideItems.add(textItemCreator.createSlideItem(Level.BASE.getValue(), "This is the end of the presentation."));
		slideItems.add(bitmapItemCreator.createSlideItem(Level.BASE.getValue(), "img/JabberPoint.jpg"));

		baselineBuilder.baselineCreatorSetup("The third slide", slideItems);

		presentation.append(baselineBuilder.getResult());


		slideItems = new Vector<>();
		slideItems.add(textItemCreator.createSlideItem(Level.MAX.getValue(), "Thank you for your attention!!"));
		slideItems.add(bitmapItemCreator.createSlideItem(Level.MAX.getValue(), "img/finalMeme.jpg"));

		baselineBuilder.baselineCreatorSetup("Final slide", slideItems);

		presentation.append(baselineBuilder.getResult());
	}

	public void saveFile(Presentation presentation, String unusedFilename) {
		throw new IllegalStateException("Save As->Demo! called");
	}
}
