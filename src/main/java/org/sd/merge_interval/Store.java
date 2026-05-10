package org.sd.merge_interval;

import java.util.List;

public class Store {
    private final int id;
    private final List<StoreDetails> storeDetails;

    public Store(int id, List<StoreDetails> storeDetails) {
        this.id = id;
        this.storeDetails = storeDetails;
    }

    public int getId() {
        return id;
    }

    public List<StoreDetails> getStoreDetails() {
        return storeDetails;
    }
}
