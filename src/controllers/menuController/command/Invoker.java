package controllers.menuController.command;

import presentation.Presentation;

import java.awt.*;

public class Invoker {
    private Command command;

    public Invoker() {
    }

    public void setCommand(Command command){
        this.command = command;
    }

    public void execute(Frame parent, Presentation presentation){
        this.command.execute(parent, presentation);
    }
}