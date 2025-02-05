import java.util.Arrays;
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //int[] arr = new int[m+n];
        int p = 0;
        for(int i=0;i<nums1.length;i++)
        {
            if(i<m)
            {
                nums1[i] = nums1[i];
            }
            else
            {
                nums1[i] = nums2[p];
                p++;
            }
        }
        Arrays.sort(nums1);
    }
}