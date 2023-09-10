public class _4_Median_of_2_sorted_array {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int result = 0;
        int m = nums1.length;
        int n = nums2.length;
        int[] total = new int[m + n];
        int i = 0;
        int j = 0;
        for (int k = 0; k < m + n; k++) {
            if (i >= m) total[k] = nums2[j++];
            else if (j >= n) total[k] = nums1[i++];
            else if (nums1[i] <= nums2[j]) total[k] = nums1[i++];
            else total[k] = nums2[j++];
        }

        for (int x : total) {
            System.out.print(x + " ");
        }
        double median = 0;
        if (total.length % 2 == 0) {
            median = (total[total.length / 2] + total[(total.length / 2) - 1]) / 2.0;
        } else {
            median = total[total.length / 2];
        }
        return median;
    }

    public static void main(String[] args) {

    }

}
