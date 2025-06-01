package bits;

public class SingleNum {
    public int singleNumber(int[] nums){
        int result = nums[0];
        for(int i = 1; i < nums.length; i++) result ^= nums[i];

        return result;
    }

    public static void main(String[] args) {
        SingleNum singleNumFinder = new SingleNum();
        int[] nums = {4, 1, 2, 1, 2};
        int singleNumber = singleNumFinder.singleNumber(nums);
        System.out.println("The single number is: " + singleNumber);
    }
}
