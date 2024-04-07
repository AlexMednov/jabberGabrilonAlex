package style.enums;

public enum Level {
    BASE(1),
    LOW(2),
    MED(3),
    HIGH(4),
    MAX(5);

    private final int value;
    Level(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
