package controllers.keyController;

import java.awt.event.KeyEvent;
import java.awt.event.KeyAdapter;

import presentation.Presentation;

public class KeyController extends KeyAdapter {
	private Presentation presentation; // Commands are given to the presentation

	public KeyController(Presentation presentation) {
		super();
		this.presentation = presentation;
	}

	public Presentation getPresentation()
	{
		return presentation;
	}

	public void setPresentation(Presentation presentation)
	{
		this.presentation = presentation;
	}

	//Checks the key pressed and determines the outocome of the key pressed
	public void keyPressed(KeyEvent keyEvent) {
		switch(keyEvent.getKeyCode()) {
			case KeyEvent.VK_PAGE_DOWN:
			case KeyEvent.VK_DOWN:
			case KeyEvent.VK_ENTER:
			case '+':
				presentation.nextSlide();
				break;
			case KeyEvent.VK_PAGE_UP:
			case KeyEvent.VK_UP:
			case '-':
				presentation.prevSlide();
				break;
			case KeyEvent.VK_Q:
				System.exit(0);
				break; // Probably never reached!!
			default:
				break;
		}
	}
}
