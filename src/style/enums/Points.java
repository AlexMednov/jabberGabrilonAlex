package style.enums;

public enum Points {
    NONE(0),
    LOW(24),
    MED(36),
    HIGH(40),
    MAX(48);

    private final int value;

    Points(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
