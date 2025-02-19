package org.cn.Greedy.ActivitySelection;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ActivitySelection {

    public void activitySelectionMethod(List<Activity> activities) {

        Comparator<Activity> finishTimeComparator = new Comparator<Activity>() {
            @Override
            public int compare(Activity o1, Activity o2) {
                return o1.getEndTime() - o2.getEndTime();
            }
        };

        Collections.sort(activities, finishTimeComparator);

        Activity previousActivity = activities.get(0);
        int activityCount = 0;

        for (int i = 1; i < activities.size(); i++) {
            Activity activity = activities.get(i);
            if (activity.getStartTime() >= previousActivity.getEndTime()) {
                System.out.println(activity);
                previousActivity = activity;
                activityCount++;
            }
        }


    }
}
