package enums;

public enum Points {
    NONE(0),
    LOW(24),
    MED(36),
    HIGH(40),
    MAX(48);

    private int value;

    Points(int value) {
    }

    public int getValue() {
        return value;
    }
}
