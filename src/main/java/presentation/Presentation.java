package presentation;

import slide.BaseSlide;
import slide.Slide;

import java.util.ArrayList;

public class Presentation {
	private String showTitle; // title of the presentation
	private ArrayList<Slide> showList; // an ArrayList with Slides
	private int currentSlideNumber; // the slidenummer of the current slide.Slide
	private SlideViewerComponent slideViewComponent; // the viewcomponent of the Slides

	public Presentation()
	{
		clear();
	}

	public Presentation(SlideViewerComponent slideViewerComponent) {
		this.slideViewComponent = slideViewerComponent;
		clear();
	}

	public String getShowTitle()
	{
		return showTitle;
	}

	public void setShowTitle(String showTitle)
	{
		this.showTitle = showTitle;
	}

	public ArrayList<Slide> getShowList()
	{
		return showList;
	}

	public void setShowList(ArrayList<Slide> showList)
	{
		this.showList = showList;
	}

	public int getCurrentSlideNumber()
	{
		return currentSlideNumber;
	}

	public void setCurrentSlideNumber(int currentSlideNumber)
	{
		this.currentSlideNumber = currentSlideNumber;
	}

	public SlideViewerComponent getSlideViewComponent()
	{
		return slideViewComponent;
	}

	public void setSlideViewComponent(SlideViewerComponent slideViewComponent)
	{
		this.slideViewComponent = slideViewComponent;
	}

	// Get a slide with a certain slide number
	public Slide getSlide(int number) {
		if (0 > number || number >= getSize()){
			return null;
		}
		return showList.get(number);
	}

	// Give the current slide
	public Slide getCurrentSlide() {
		return getSlide(currentSlideNumber);
	}

	public int getSize() {
		return showList.size();
	}

	public String getTitle() {
		return showTitle;
	}

	public void setTitle(String nt) {
		showTitle = nt;
	}

	public void setShowView(SlideViewerComponent slideViewerComponent) {
		this.slideViewComponent = slideViewerComponent;
	}

	// give the number of the current slide
	public int getSlideNumber() {
		return currentSlideNumber;
	}

	// change the current slide number and signal it to the window
	public void setSlideNumber(int number) {
		currentSlideNumber = number;
		if (slideViewComponent != null) {
			slideViewComponent.update(this, getCurrentSlide());
		}
	}

	// go to the previous slide unless your at the beginning of the presentation
	public void prevSlide() {
		if (0 < currentSlideNumber) {
			setSlideNumber(currentSlideNumber - 1);
		}
	}

	// go to the next slide unless your at the end of the presentation.
	public void nextSlide() {
		if (currentSlideNumber < (showList.size()-1)) {
			setSlideNumber(currentSlideNumber + 1);
		}
	}

	// Delete the presentation to be ready for the next one.
	public void clear() {
		showList = new ArrayList<>();
		setSlideNumber(-1);
	}

	// Add a slide to the presentation
	public void append(BaseSlide slide) {
		showList.add((Slide) slide);
	}

	public void exit(int n) {
		System.exit(n);
	}
}
