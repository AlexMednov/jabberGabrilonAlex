package controllers.menuController.command;

import presentation.Presentation;

import java.awt.*;

public class GoTo implements Command{
    private Reciever reciever;

    public GoTo(Reciever reciever) {
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
        return this.reciever.goTo(parent, presentation);
    }
}
