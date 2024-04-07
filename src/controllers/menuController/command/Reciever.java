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

        return parent;
    }

    public Frame openFile(Frame parent, Presentation presentation, String path){
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
        presentation.exit(0);

        return parent;
    }

    public Frame next(Frame parent, Presentation presentation){
        presentation.nextSlide();

        return parent;
    }

    public Frame prev(Frame parent, Presentation presentation){
        presentation.prevSlide();

        return parent;
    }

    public Frame goTo(Frame parent, Presentation presentation){
        String pageNumberStr = JOptionPane.showInputDialog((Object) MenuControllerConstants.PAGENR.getValue());
        int pageNumber = Integer.parseInt(pageNumberStr);
        presentation.setSlideNumber(pageNumber - 1);

        return parent;
    }

    public Frame help(Frame parent, Presentation presentation){
        AboutBox.show(parent);

        return parent;
    }
}
