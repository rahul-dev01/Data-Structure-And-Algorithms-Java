// Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.


import java.util.HashSet;

public class Question {
    static int checkLongestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) return 0;

        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int longest = 0;

        for (int num : set) {
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }

                longest = Math.max(longest, currentStreak);
            }
        }

        return longest;
    }

    public static void main(String[] args) {
        int arr[] = {100, 4, 200, 1, 3, 2};
        System.out.println(checkLongestConsecutive(arr)); 
    }
}

