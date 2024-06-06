package style.enums;

public enum Indent {
    NONE(1),
    LOW(20),
    MED(50),
    HIGH(70),
    MAX(90);
    private final int value;

    Indent(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
