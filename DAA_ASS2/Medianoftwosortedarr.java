
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int m = nums1.length;
        int n = nums2.length;

        int[] result = new int[m + n];

        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                result[k--] = nums1[i--];
            } else {
                result[k--] = nums2[j--];
            }
        }

        while (i >= 0)
            result[k--] = nums1[i--];

        while (j >= 0)
            result[k--] = nums2[j--];

        int len = result.length;
        int mid = len / 2;

        if (len % 2 == 0) {
            return (result[mid - 1] + result[mid]) / 2.0;
        } else {
            return result[mid];
        }
    }
}
