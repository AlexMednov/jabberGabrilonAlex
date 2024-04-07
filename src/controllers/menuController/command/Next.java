package controllers.menuController.command;

import presentation.Presentation;

import java.awt.*;

public class Next implements Command{
    private Reciever receiver;

    public Next(Reciever receiver) {
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
        return this.receiver.next(parent, presentation);
    }
}
