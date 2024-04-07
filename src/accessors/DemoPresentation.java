package accessors;

import builder.BaselineBuilder;
import builder.Director;
import slide.Factory.BitmapItemCreator;
import slide.Factory.SlideItemCreator;
import slide.Factory.TextItemCreator;
import presentation.Presentation;
import slide.SlideItem;
import style.enums.*;

import java.util.Vector;

class DemoPresentation extends Accessor {
	public void loadFile(Presentation presentation, String unusedFilename) {
		BaselineBuilder baselineBuilder = new BaselineBuilder();
		Director director = new Director(baselineBuilder);

		SlideItemCreator textItemCreator = new TextItemCreator();
		SlideItemCreator bitmapItemCreator = new BitmapItemCreator();

		//All the necessary elements for factory and builder are initialised

		presentation.setTitle("Demo presentation.Presentation");
		//Title is set

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
		//Slide items are created

		director.make("jabberPoint.JabberPoint", slideItems);
		//Director creates an instance of slide

		presentation.append(director.getBuilder().getResult());
		//The slide is appended to the presentation


		slideItems = new Vector<>();
		slideItems.add((textItemCreator.createSlideItem(Level.BASE.getValue(), "Level 1")));
		slideItems.add((textItemCreator.createSlideItem(Level.LOW.getValue(), "Level 2")));
		slideItems.add((textItemCreator.createSlideItem(Level.BASE.getValue(), "Again level 1")));
		slideItems.add((textItemCreator.createSlideItem(Level.BASE.getValue(), "Level 1 has style number 1")));
		slideItems.add((textItemCreator.createSlideItem(Level.LOW.getValue(), "Level 2 has style number 2")));
		slideItems.add((textItemCreator.createSlideItem(Level.MED.getValue(), "This is how level 3 looks like")));
		slideItems.add((textItemCreator.createSlideItem(Level.HIGH.getValue(), "And this is level 4")));
		//Slide items are created

		director.make("Demonstration of levels and stijlen", slideItems);
		//Director creates an instance of slide

		presentation.append(director.getBuilder().getResult());
		//The slide is appended to the presentation


		slideItems = new Vector<>();
		slideItems.add(textItemCreator.createSlideItem(Level.BASE.getValue(), "To open a new presentation,"));
		slideItems.add(textItemCreator.createSlideItem(Level.LOW.getValue(), "use File->Open from the menu."));
		slideItems.add(textItemCreator.createSlideItem(Level.BASE.getValue(), " "));
		slideItems.add(textItemCreator.createSlideItem(Level.BASE.getValue(), "This is the end of the presentation."));
		slideItems.add(bitmapItemCreator.createSlideItem(Level.BASE.getValue(), "img/JabberPoint.jpg"));
		//Slide items are created

		director.make("The third slide", slideItems);
		//Director creates an instance of slide

		presentation.append(director.getBuilder().getResult());
		//The slide is appended to the presentation


		slideItems = new Vector<>();
		slideItems.add(textItemCreator.createSlideItem(Level.MAX.getValue(), "Thank you for your attention!!"));
		slideItems.add(bitmapItemCreator.createSlideItem(Level.MAX.getValue(), "img/finalMeme.jpg"));
		//Slide items are created

		director.make("Final slide", slideItems);
		//Builder creates an instance of slide

		presentation.append(director.getBuilder().getResult());
		//The slide is appended to the presentation
	}

	public void saveFile(Presentation presentation, String unusedFilename) {
		throw new IllegalStateException("Save As->Demo! called");
	}
}
