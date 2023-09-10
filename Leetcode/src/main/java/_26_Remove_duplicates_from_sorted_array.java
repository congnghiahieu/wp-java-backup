public class _26_Remove_duplicates_from_sorted_array {

    public int removeDuplicates(int[] nums) {
        int uniqueNums = 1;
        int current = 1;
        int prev = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != prev) {
                nums[current++] = nums[i];
                uniqueNums++;
            }
            prev = nums[i];
        }

        return uniqueNums;
    }
}
