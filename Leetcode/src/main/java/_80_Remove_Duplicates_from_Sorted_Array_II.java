public class _80_Remove_Duplicates_from_Sorted_Array_II {
    public int removeDuplicatesN(int[] nums, int threshold) {
        int current = 1;
        int prev = nums[0];
        int curDupsNum = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != prev) {
                nums[current++] = nums[i];
                curDupsNum = 0;
            } else {
                if (curDupsNum + 1 <= threshold) {
                    nums[current++] = nums[i];
                }
                curDupsNum++;
            }
            prev = nums[i];
        }

        // current = no duplicates array length
        // can return current instead of uniqueNums
        return current;
    }

    public int removeDuplicates(int[] nums) {
        return removeDuplicatesN(nums, 1);
    }
}
