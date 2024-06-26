package controllers.menuController;

import controllers.menuController.command.*;
import controllers.menuController.enums.MenuControllerConstants;
import presentation.Presentation;

import java.awt.MenuBar;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuItem;
import java.awt.MenuShortcut;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuController extends MenuBar {

	private Frame parent; // the frame, only used as parent for the Dialogs
	private Presentation presentation; // Commands are given to the presentation

	private static final long serialVersionUID = 227L;

	public MenuController(Frame frame, Presentation pres) {
		this.parent = frame;
		this.presentation = pres;

		Invoker invoker = new Invoker();
		Reciever reciever = new Reciever();

		MenuItem menuItem;
		Menu fileMenu = new Menu(MenuControllerConstants.FILE.getValue());
		//Code bellow assigns listeners to specific actions that a user can perform
		//This includes goTo, next, previous etc.
		//The actions are performed via command pattern with receiver, receiving those actions


		//Open file
		menuItem = mkMenuItem(MenuControllerConstants.OPEN.getValue());
		fileMenu.add(menuItem);
		menuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				Command open = new Open(reciever, MenuControllerConstants.DEFPATH.getValue());
				invoker.setCommand(open);
				parent = invoker.execute(parent, presentation);
			}
		});

		//New file
		menuItem = mkMenuItem(MenuControllerConstants.NEW.getValue());
		fileMenu.add(menuItem);
		menuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				Command newFile = new New(reciever);
				invoker.setCommand(newFile);
				parent = invoker.execute(parent, presentation);
			}
		});

		//Save file
		menuItem = mkMenuItem(MenuControllerConstants.SAVE.getValue());
		fileMenu.add(menuItem);
		menuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Command save = new Save(reciever, MenuControllerConstants.DEFPATH.getValue());
				invoker.setCommand(save);
				parent = invoker.execute(parent, presentation);
			}
		});

		//Exit file
		fileMenu.addSeparator();
		menuItem = mkMenuItem(MenuControllerConstants.EXIT.getValue());
		fileMenu.add(menuItem);
		menuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				Command exit = new Exit(reciever);
				invoker.setCommand(exit);
				parent = invoker.execute(parent, presentation);
			}
		});

		//Adding All the assigned stuff to the menu bar
		add(fileMenu);

		//Adding another dropdown
		Menu viewMenu = new Menu(MenuControllerConstants.VIEW.getValue());

		//Next slide
		menuItem = mkMenuItem(MenuControllerConstants.NEXT.getValue());
		viewMenu.add(menuItem);
		menuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				Command next = new Next(reciever);
				invoker.setCommand(next);
				parent = invoker.execute(parent, presentation);
			}
		});

		//Previous slide
		menuItem = mkMenuItem(MenuControllerConstants.PREV.getValue());
		viewMenu.add(menuItem);
		menuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				Command prev = new Previous(reciever);
				invoker.setCommand(prev);
				parent = invoker.execute(parent, presentation);
			}
		});

		//Go to slide
		menuItem = mkMenuItem(MenuControllerConstants.GOTO.getValue());
		viewMenu.add(menuItem);
		menuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				Command goTo = new GoTo(reciever);
				invoker.setCommand(goTo);
				parent = invoker.execute(parent, presentation);
			}
		});

		//adding all the assigned elements to menu bar
		add(viewMenu);

		//Help box
		Menu helpMenu = new Menu(MenuControllerConstants.HELP.getValue());
		menuItem = mkMenuItem(MenuControllerConstants.ABOUT.getValue());
		helpMenu.add(menuItem);
		menuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				Command help = new Help(reciever);
				invoker.setCommand(help);
				parent = invoker.execute(parent, presentation);
			}
		});
		setHelpMenu(helpMenu);		// needed for portability (Motif, etc.).
	}

	// create a menu item
	public MenuItem mkMenuItem(String name) {
		return new MenuItem(name, new MenuShortcut(name.charAt(0)));
	}
}
