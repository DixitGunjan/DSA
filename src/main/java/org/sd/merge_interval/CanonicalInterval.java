package org.sd.merge_interval;

public class CanonicalInterval {
    private final double openingTime;
    private final double closingTime;

    public CanonicalInterval(double openingTime, double closingTime) {
        this.openingTime = openingTime;
        this.closingTime = closingTime;
    }

    public double getOpeningTime() {
        return openingTime;
    }

    public double getClosingTime() {
        return closingTime;
    }

    @Override
    public String toString() {
        return "CanonicalInterval{" +
                "openingTime=" + openingTime +
                ", closingTime=" + closingTime +
                '}';
    }
}
