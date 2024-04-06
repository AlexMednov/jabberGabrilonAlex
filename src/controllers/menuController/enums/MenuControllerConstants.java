package controllers.menuController.enums;

public enum MenuControllerConstants {
    SAVEERR("Save Error"),
    LOADERR("Load Error"),
    IOEX("IO Exception: "),
    SAVEFILE("dump.xml"),
    TESTFILE("test.xml"),
    VIEW("View"),
    SAVE("Save"),
    PREV("Prev"),
    PAGENR("Page number?"),
    OPEN("Open"),
    NEXT("Next"),
    NEW("New"),
    HELP("Help"),
    GOTO("Go to"),
    EXIT("Exit"),
    FILE("File"),
    ABOUT("About");

    private String value;

    MenuControllerConstants(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
