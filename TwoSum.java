class Solution {
    public int[] twoSum(int[] nums, int target) {
        int currentSum = 0;
        int[] twoNums = {0, 1};
        for (int i = 0; i < nums.length; i++){
            for (int j = 0; j < nums.length; j++){
                if (j == i) {
                    currentSum = 0;
                } else {
                    currentSum = nums[i] + nums[j];
                }
                if (currentSum == target){
                    twoNums[0] = i;
                    twoNums[1] = j;
                }
                if (currentSum == target)
                    break;
            }
            if (currentSum == target)
                    break;
        }
        return twoNums;
    }
}