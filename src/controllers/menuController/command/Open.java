package controllers.menuController.command;

import presentation.Presentation;

import java.awt.*;

public class Open implements Command{
    private Reciever receiver;
    private String openPath;

    public Open(Reciever receiver, String openPath) {
        this.receiver = receiver;
        this.openPath = openPath;
    }

    public Reciever getReceiver() {
        return receiver;
    }

    public void setReceiver(Reciever reciever) {
        this.receiver = reciever;
    }

    public String getOpenPath() {
        return openPath;
    }

    public void setOpenPath(String openPath) {
        this.openPath = openPath;
    }

    @Override
    public Frame execute(Frame parent, Presentation presentation) {
        return this.receiver.openFile(parent, presentation, this.openPath);
    }
}