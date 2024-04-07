package controllers.command;

import static org.junit.jupiter.api.Assertions.*;

import controllers.menuController.command.*;
import org.junit.jupiter.api.Test;

public class CommandTest {
    @Test
    void creatingInvoker_expectNoException_comparingCommand(){
        Reciever reciever = new Reciever();
        Command next = new Next(reciever);

        Invoker invoker = new Invoker();
        invoker.setCommand(next);

        assertEquals(next, invoker.getCommand());
    }

    @Test
    void creatingInvokerChangingCommand_expectNoException_comparingCommand(){
        Reciever reciever = new Reciever();
        Command next = new Next(reciever);

        Invoker invoker = new Invoker();
        invoker.setCommand(next);

        Command open = new Open(reciever, "A path");
        invoker.setCommand(open);

        assertEquals(open, invoker.getCommand());
    }
}
