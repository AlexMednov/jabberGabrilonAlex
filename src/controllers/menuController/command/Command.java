package controllers.menuController.command;
import presentation.Presentation;

import java.awt.Frame;

public interface Command {
    public abstract Frame execute(Frame parent, Presentation presentation);
}
