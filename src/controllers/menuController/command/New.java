package controllers.menuController.command;

public class New implements Command{
    private String receiver;

    public New(String receiver) {
        this.receiver = receiver;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {

    }
}
