public enum Seasons {
    AUTUMN(1),
    SPRING(2),
    WINTER(3),
    SUMMER(4);

    Seasons(int season) {
        this.season = season;
    }

    public int getSeason() {
        return season;
    }

    private int season;

}
