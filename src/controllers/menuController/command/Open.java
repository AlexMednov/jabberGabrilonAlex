package controllers.menuController.command;

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
    public void execute() {

    }
}
