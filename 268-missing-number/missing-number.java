class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[0]!=0){
                return 0;
            }
            else if(i==nums.length-1 || nums[i+1]-nums[i]!=1){
                return i+1;
            }
        }
        return 0;
    }
}