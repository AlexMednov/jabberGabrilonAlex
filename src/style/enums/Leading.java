package style.enums;

public enum Leading {
    NONE(0),
    LOW(10),
    MED(20),
    HIGH(30);

    private final int value;
    Leading(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
