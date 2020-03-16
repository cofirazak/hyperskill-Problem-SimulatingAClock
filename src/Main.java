class Clock {

    int hours = 12;
    int minutes = 0;

    void next() {
        if ((minutes = ++minutes % 60) == 0) {
            hours = hours % 12 + 1;
        }
    }

    @Override
    public String toString() {
        return "Clock{" +
            "hours=" + hours +
            ", minutes=" + minutes +
            '}';
    }
}
