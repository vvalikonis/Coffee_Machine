enum DangerLevel {
    HIGH(3),
    MEDIUM(2),
    LOW(1);

    int levels;

    DangerLevel(int levels) {
        this.levels = levels;
    }

    int getLevel() {
        return levels;
    }

}