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
    private Reciever receiver;
    private Presentation presentation;

    public New(Reciever receiver, Presentation presentation) {
        this.receiver = receiver;
        this.presentation = presentation;
    }

    public Reciever getReceiver() {
        return receiver;
    }

    public void setReceiver(Reciever receiver) {
        this.receiver = receiver;
    }

    public Presentation getPresentation() {
        return presentation;
    }

    public void setPresentation(Presentation presentation) {
        this.presentation = presentation;
    }
    @Override
    public Frame execute(Frame parent, Presentation presentation) {
        return this.receiver.newFile(parent, presentation);
    }
}
