package arrays;

public class MaxSubarray {
    public int maxSubarray(int[] nums){
        int maxSum = nums[0];
        int sum = nums[0];

        for(int i = 0; i < nums.length; i++){
            if(sum < 0) sum = 0;
            sum += nums[i];
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }
    public static void main(String[] args) {
        MaxSubarray maxSubarray = new MaxSubarray();
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int result = maxSubarray.maxSubarray(nums);
        System.out.println("Maximum subarray sum is: " + result); // Output: 6
    }
}
