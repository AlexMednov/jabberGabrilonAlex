package controllers.menuController.command;

import java.awt.Frame;

import presentation.Presentation;

public class New implements Command{
    private Reciever receiver;

    public New(Reciever receiver) {
        this.receiver = receiver;
    }

    public Reciever getReceiver() {
        return receiver;
    }

    public void setReceiver(Reciever receiver) {
        this.receiver = receiver;
    }

    @Override
    public Frame execute(Frame parent, Presentation presentation) {
        return this.receiver.newFile(parent, presentation);
    }
}
