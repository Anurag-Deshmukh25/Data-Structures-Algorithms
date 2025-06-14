package arrays;

public class MaxConsecOnes {
    public int maxConsecutiveOnes(int[] nums){
        int maxCount = 0;
        int count = 0;
        for(int num : nums){
            if(num == 1){
                count++;
                maxCount = Math.max(maxCount, count);
            }
            else count = 0;
        }

        return maxCount;
    }

    public static void main(String[] args) {
        MaxConsecOnes maxConsecOnes = new MaxConsecOnes();
        int[] nums = {1, 1, 0, 1, 1, 1};
        System.out.println("Maximum consecutive ones: " + maxConsecOnes.maxConsecutiveOnes(nums));
    }
}
