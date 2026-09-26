/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {

    public int minMeetingRooms(List<Interval> intervals) {
        List<Integer> startTimes = intervals.stream().map(i -> i.start).sorted().toList();
        List<Integer> endTimes = intervals.stream().map(i -> i.end).sorted().toList();

        int maxRooms = 0, count = 0, s=0, e=0;

        while (s < startTimes.size()) {
            if (startTimes.get(s) < endTimes.get(e)) {
                count++;
                s++;
            } else {
                count--;
                e++;
            }
            maxRooms = Math.max(count, maxRooms);
        }
        return maxRooms;
    }

}
