import java.util.Arrays;
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] arr = new int[nums1.length+nums2.length];
        int j=0;
        for(int i=0; i<arr.length; i++)
        {
            if(i<=nums1.length-1)
                arr[i] = nums1[i];
            if(i>nums1.length-1)
            {
                arr[i] = nums2[j];
                j++;
            }     
        }
        Arrays.sort(arr);
        if(arr.length % 2 != 0)
        {
            return (arr[(arr.length/2)]);
        }
        else
        {
            return ((arr[(arr.length/2-1)]+arr[(arr.length/2)])/2.0);
        }
    }
}