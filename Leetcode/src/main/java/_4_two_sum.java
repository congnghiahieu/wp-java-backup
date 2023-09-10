import java.util.HashSet;

public class _4_two_sum {
    public static int[] twoSum(int[] nums, int target) {
        HashSet need = new HashSet<Integer>();
        for (int x : nums) {
            need.add(target - x);
        }
        System.out.println(need);
        int indexOfa = -1;
        int indexOfb = -1;
        for (int i = 0; i < nums.length; i++) {
            System.out.println(i);
            if (indexOfa == -1 && need.contains(target - nums[i])) {
                System.out.println("Find match indexOfa");
                indexOfa = i;
            } else if (indexOfa != -1 && target - nums[i] == nums[indexOfa]) {
                System.out.println("Find match indexOfb");
                indexOfb = i;
            }
        }
        return new int[]{indexOfa, indexOfb};
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 11, 15};

        for (int x : twoSum(nums, 9)) {
            System.out.println(x);
        }

    }
}
