package controllers.menuController.command;

import presentation.Presentation;

import java.awt.*;

public class Help implements Command{
    private Reciever reciever;

    public Help(Reciever reciever) {
        this.reciever = reciever;
    }

    public Reciever getReciever() {
        return reciever;
    }

    public void setReciever(Reciever reciever) {
        this.reciever = reciever;
    }

    @Override
    public Frame execute(Frame parent, Presentation presentation) {
        return this.reciever.help(parent, presentation);
    }
}
