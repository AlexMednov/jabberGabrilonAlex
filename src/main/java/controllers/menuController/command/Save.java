package controllers.menuController.command;

import presentation.Presentation;

import java.awt.*;

public class Save implements Command{
    private Reciever receiver;
    private String savePath;

    public Save(Reciever receiver, String savePath) {
        this.receiver = receiver;
        this.savePath = savePath;
    }

    public Reciever getReciever() {
        return receiver;
    }

    public void setReceiver(Reciever reciever) {
        this.receiver = reciever;
    }

    public String getSavePath() {
        return savePath;
    }

    public void setSavePath(String savePath) {
        this.savePath = savePath;
    }

    @Override
    public Frame execute(Frame parent, Presentation presentation) {
        return this.receiver.saveFile(parent, presentation, this.savePath);
    }
}
