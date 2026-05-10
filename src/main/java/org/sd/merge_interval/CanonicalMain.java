package org.sd.merge_interval;

import java.util.*;

public class CanonicalMain {

    public static Map<Integer, List<CanonicalInterval>> calculateCanonicalIntervals(List<Store> stores) {
        // Implementation to calculate canonical intervals for each store
        // This would involve merging overlapping intervals for each store and returning the result
        if (stores.isEmpty()) {
            return Map.of(); // Return an empty map if there are no stores
        }
        Map<Integer, List<CanonicalInterval>> resultMap = new java.util.HashMap<>();
        for (Store store : stores) {
            // Process each store's details to calculate canonical intervals
            // This would involve sorting the intervals and merging them as needed
            List<CanonicalInterval> canonicalIntervals = new ArrayList<>();
            List<StoreDetails> sortedDetails = store.getStoreDetails().stream().sorted(Comparator.comparing(StoreDetails::getOpenTime)).toList();

            for (int i = 0; i < sortedDetails.size(); i++) {
                StoreDetails current = sortedDetails.get(i);
                double openTime = current.getOpenTime();
                double closeTime = current.getCloseTime();

                while (i < sortedDetails.size() - 1 && sortedDetails.get(i + 1).getOpenTime() <= closeTime) {
                    closeTime = Math.max(closeTime, sortedDetails.get(i + 1).getCloseTime());
                    i++;
                }
                canonicalIntervals.add(new CanonicalInterval(openTime, closeTime));

            }
            resultMap.put(store.getId(), canonicalIntervals);
        }
        return resultMap;
    }

    private static double openTime(List<CanonicalInterval> intervals) {
        double totalOpenTime = 0.0;
        for (CanonicalInterval interval : intervals) {
            totalOpenTime += (interval.getClosingTime() - interval.getOpeningTime());
        }
        return totalOpenTime;
    }

    private static boolean checkIfOpenAtTime(List<CanonicalInterval> intervals, double time) {
        for (CanonicalInterval interval : intervals) {
            if (time >= interval.getOpeningTime() && time <= interval.getClosingTime()) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Store store1 = new Store(101, List.of(
                new StoreDetails("HQ", 09.00, 12.00),
                new StoreDetails("GMAP", 11.00, 14.00),
                new StoreDetails("News-Paper", 15.00, 18.00)
        ));

        Map<Integer, List<CanonicalInterval>> intervals = calculateCanonicalIntervals1(List.of(store1));
        for(Map.Entry<Integer, List<CanonicalInterval>> entry: intervals.entrySet()){
            System.out.println("Store ID - " + entry.getKey() + " Open Intervals - " + entry.getValue());
        }
        System.out.println("Total Open Time - " + String.format("%.2f", openTime(intervals.get(101))) + " hours");

        System.out.println("Enter Time to check if store is open - ");
        double time = new Scanner(System.in).nextDouble();

        System.out.println("is store open at - " + String.format("%.2f", time) + " hrs- " + checkIfOpenAtTime(intervals.get(101), time));
    }

    public static Map<Integer, List<CanonicalInterval>> calculateCanonicalIntervals1(List<Store> stores) {
        if (stores == null || stores.isEmpty()) {
            return Map.of();
        }

        Map<Integer, List<CanonicalInterval>> resultMap = new HashMap<>();

        for (Store store : stores) {
            List<StoreDetails> details = store.getStoreDetails();

            if (details == null || details.isEmpty()) {
                resultMap.put(store.getId(), List.of());
                continue;
            }

            List<StoreDetails> sortedDetails = details.stream()
                    .sorted(Comparator.comparing(StoreDetails::getOpenTime))
                    .toList();

            List<CanonicalInterval> canonicalIntervals = new ArrayList<>();

            double currentOpen = sortedDetails.get(0).getOpenTime();
            double currentClose = sortedDetails.get(0).getCloseTime();

            for (int i = 1; i < sortedDetails.size(); i++) {
                StoreDetails next = sortedDetails.get(i);

                if (next.getOpenTime() <= currentClose) {
                    currentClose = Math.max(currentClose, next.getCloseTime());
                } else {
                    canonicalIntervals.add(new CanonicalInterval(currentOpen, currentClose));
                    currentOpen = next.getOpenTime();
                    currentClose = next.getCloseTime();
                }
            }

            canonicalIntervals.add(new CanonicalInterval(currentOpen, currentClose));
            resultMap.put(store.getId(), canonicalIntervals);
        }

        return resultMap;
    }
    

}
