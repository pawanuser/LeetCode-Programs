class Solution {
    public int removeDuplicates(int[] nums) {
        int[] arr = new int[nums.length];

        int j = 0;
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i] != nums[i+1])
            {
                arr[j] = nums[i];
                j++;
            }
        } 
        arr[j++] = nums[nums.length-1];
        
        for(int i=0;i<j;i++)
            nums[i] = arr[i];
        return j;
    }
}