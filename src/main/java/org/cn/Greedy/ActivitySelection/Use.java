package org.cn.Greedy.ActivitySelection;

import java.util.ArrayList;
import java.util.List;

public class Use {
    public static void main(String[] args) {
        List<Activity> activities = new ArrayList<>();

        activities.add(new Activity("A", 0, 6));
        activities.add(new Activity("B", 3, 4));
        activities.add(new Activity("C", 1, 2));
        activities.add(new Activity("D", 5, 8));
        activities.add(new Activity("E", 5, 7));
        activities.add(new Activity("F", 8, 9));

        new ActivitySelection().activitySelectionMethod(activities);
    }
}
