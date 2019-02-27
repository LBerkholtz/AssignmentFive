package lberkholtz.advancedjava.assignmentfive.services;

/**
 * An enumeration that represents a of unit of time
 */
public enum Interval {

    HOURLY(60), DAILY(60*24), WEEKLY(60 * 24* 7);

    private int minutes;

    /**
     * Create a new  Interval enumeration.
     * @param minutes the number of minutes in the interval
     */
    private Interval(int minutes) {
        this.minutes = minutes;
    }

    /**
     *
     * @return the number of minutes in the interval
     */
    public int getMinutes() {
        return minutes;
    }
}
