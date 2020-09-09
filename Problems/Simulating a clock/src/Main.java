class Clock {

    int hours = 12;
    int minutes = 0;

    void next() {
        if (minutes < 59) {
            minutes++;
        } else if (hours < 12) {
            minutes = 0;
            hours++;
        } else {
            hours = 1;
            minutes = 0;
        }
    }

}
