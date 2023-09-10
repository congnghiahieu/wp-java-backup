public class _88_Merge_Sorted_Array {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] total = new int[m + n];
        int i = 0;
        int j = 0;
        for (int k = 0; k < m + n; k++) {
            if (i >= m) total[k] = nums2[j++];
            else if (j >= n) total[k] = nums1[i++];
            else if (nums1[i] <= nums2[j]) total[k] = nums1[i++];
            else total[k] = nums2[j++];
        }
        for (int k = 0; k < m + n; k++) {
            nums1[k] = total[k];
        }
    }
}
