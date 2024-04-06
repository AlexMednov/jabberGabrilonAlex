package controllers.menuController.command;

import accessors.Accessor;
import accessors.XMLAccessor;
import java.awt.Frame;

import controllers.menuController.MenuController;
import controllers.menuController.enums.MenuControllerConstants;
import presentation.Presentation;

import javax.swing.*;
import java.io.IOException;

public class New implements Command{
    private String receiver;
    private Presentation presentation;

    public New(String receiver, Presentation presentation) {
        this.receiver = receiver;
        this.presentation = presentation;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public Presentation getPresentation() {
        return presentation;
    }

    public void setPresentation(Presentation presentation) {
        this.presentation = presentation;
    }
    @Override
    public void execute(Frame parent) {
        presentation.clear();
        Accessor xmlAccessor = new XMLAccessor();
        try {
            xmlAccessor.loadFile(presentation, MenuControllerConstants.TESTFILE.getValue());
            presentation.setSlideNumber(0);
        } catch (IOException exc) {
            JOptionPane.showMessageDialog(parent, MenuControllerConstants.IOEX.getValue() + exc,
                    MenuControllerConstants.LOADERR.getValue(), JOptionPane.ERROR_MESSAGE);
        }
        parent.repaint();
    }
}
