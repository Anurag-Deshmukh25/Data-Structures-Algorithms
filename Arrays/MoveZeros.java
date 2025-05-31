package arrays;

public class MoveZeros {
    public void moveZeroes(int[] nums){
        int j = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                nums[j++] = nums[i];
            }
        }

        while(j < nums.length){
            nums[j++] = 0;
        }
    }

    public static void main(String[] args) {
        MoveZeros mover = new MoveZeros();
        int[] nums = {0, 1, 0, 3, 12};
        mover.moveZeroes(nums);
        
        for(int num : nums){
            System.out.print(num + " ");
        }
    }
}
