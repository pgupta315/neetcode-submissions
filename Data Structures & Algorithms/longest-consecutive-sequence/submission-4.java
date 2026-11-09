
/**
- consecutive numbers
- longest sequence (can have multiple)
- can have dupes (should be only counted once)
*/
class Solution {
    public int longestConsecutive(int[] nums) {
        int maxSequence = 0, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        HashMap<Integer, Integer> numToSeenMap = new HashMap<>();

        // set.addAll(Arrays.asList(nums));

        for (int num: nums) {
            numToSeenMap.put(num, null); // null -> not counted yet
        }

        // 1,2,3,   5,6
        for (int num: nums) {
            // new sequence found
            if (numToSeenMap.get(num) == null) {
                int sequenceLength = 1;
                int currNum = num;
                while (numToSeenMap.containsKey(currNum+1)) {
                    // unseen num --> increment the currNum
                    currNum = currNum + 1; 
                    Integer currNumSeq = numToSeenMap.get(currNum);
                    if (currNumSeq == null) {
                        // increment the num and sequence
                        sequenceLength++; 
                        // mark as visited 
                        numToSeenMap.put(currNum, -1);
                    } else {    // visited num
                        if (currNumSeq > -1) {
                            sequenceLength = sequenceLength + currNumSeq;
                        }
                        break;
                    }
                }
                // update the longest seq from the 1st num
                numToSeenMap.put(num, sequenceLength);
                maxSequence = Math.max(maxSequence, sequenceLength);
            }
        }
        return maxSequence; 
    }
}
