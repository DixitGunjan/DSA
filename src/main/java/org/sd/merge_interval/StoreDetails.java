package org.sd.merge_interval;

public class StoreDetails {
    private final String source;
    private final double openTime;
    private final double closeTime;

    public StoreDetails(String source, double openTime, double closeTime) {
        this.source = source;
        this.openTime = openTime;
        this.closeTime = closeTime;
    }

    public String getSource() {
        return source;
    }

    public double getOpenTime() {
        return openTime;
    }

    public double getCloseTime() {
        return closeTime;
    }
}
