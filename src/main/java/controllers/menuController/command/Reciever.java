package controllers.menuController.command;

import accessors.Accessor;
import accessors.XMLAccessor;
import controllers.menuController.AboutBox;
import controllers.menuController.enums.*;
import presentation.Presentation;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class Reciever {
    public Reciever() {
    }
    public Frame newFile(Frame parent, Presentation presentation){
        presentation.clear();
        parent.repaint();
        //Creates a new file for the user

        return parent;
    }

    public Frame openFile(Frame parent, Presentation presentation, String path){
        //Opens a file for the user
        presentation.clear();
        Accessor xmlAccessor = new XMLAccessor();
        try {
            xmlAccessor.loadFile(presentation, path);
            presentation.setSlideNumber(0);
        } catch (IOException exc) {
            JOptionPane.showMessageDialog(parent, MenuControllerConstants.IOEX.getValue() + exc,
                    MenuControllerConstants.LOADERR.getValue(), JOptionPane.ERROR_MESSAGE);
        }
        parent.repaint();

        return parent;
    }

    public Frame saveFile(Frame parent, Presentation presentation, String path){
        //Saves file for the user with a specified path
        Accessor xmlAccessor = new XMLAccessor();
        try {
            xmlAccessor.saveFile(presentation, path);
        } catch (IOException exc) {
            JOptionPane.showMessageDialog(parent, MenuControllerConstants.IOEX.getValue() + exc,
                    MenuControllerConstants.SAVEERR.getValue(), JOptionPane.ERROR_MESSAGE);
        }

        return parent;
    }

    public Frame exit(Frame parent, Presentation presentation){
        //Exits the presentation
        presentation.exit(0);

        return parent;
    }

    public Frame next(Frame parent, Presentation presentation){
        //Goes to next slide
        presentation.nextSlide();

        return parent;
    }

    public Frame prev(Frame parent, Presentation presentation){
        //Goes to previous slide
        presentation.prevSlide();

        return parent;
    }

    public Frame goTo(Frame parent, Presentation presentation){
        String pageNumberStr = JOptionPane.showInputDialog((Object) MenuControllerConstants.PAGENR.getValue());
        //Creates an input window for the user to input desired go to slide

        int pageNumber = Integer.parseInt(pageNumberStr);
        //Stores that number
        int goToNumber;
        if (pageNumber > presentation.getSize()){//Checks if there are enough slides
            goToNumber = presentation.getSize();
            //If there are not enough slides, it would go to the last available
        }
        else {
            //If there are enough slides, there is no issue
            goToNumber = pageNumber;
        }
        presentation.setSlideNumber(goToNumber - 1);

        return parent;
    }

    public Frame help(Frame parent, Presentation presentation){
        //Displays help box on the screen
        AboutBox.show(parent);

        return parent;
    }
}
