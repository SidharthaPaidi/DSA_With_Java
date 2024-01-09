import java.util.*;

public class ActivitySelection {
    public class Activity {
        private String name;
        private int startTime;
        private int finishTime;

        public Activity(String name, int startTime, int finishTime) {
            this.name = name;
            this.startTime = startTime;
            this.finishTime = finishTime;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getStartTime() {
            return startTime;
        }

        public void setStartTime(int startTime) {
            this.startTime = startTime;
        }

        public int getFinishTime() {
            return finishTime;
        }

        public void setFinishTime(int finishTime) {
            this.finishTime = finishTime;
        }

        @Override
        public String toString() {
            return "Activity :" + name + " , startTime= " + startTime + "finishTime= " + finishTime;
        }

    }

    public class activitySelection {

        public static void activitySelection(ArrayList<Activity> activityList) {
            Comparator<Activity> finishTimeComparator = new Comparator<Activity>() {
                @Override
                public int compare(Activity o1, Activity o2) {
                    return o1.getFinishTime() - o2.getFinishTime();
                }
            };
            Collections.sort(activityList, finishTimeComparator);
            Activity previousActivity = activityList.get(0);

            System.out.println("\n\nRecommended Schedule:\n" + activityList.get(0));

            for (int i = 1; i < activityList.size(); i++) {
                Activity activity = activityList.get(i);
                if (activity.getStartTime() >= previousActivity.getFinishTime()) {
                    System.out.println(activity);
                    previousActivity = activity;
                }
            }

        }

    }
    public static void main(String[] args) {
        ArrayList<Activity> activityList = new ArrayList<>();
        
    }

}