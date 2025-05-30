package arrays;

public class RemDupSortedArr{
    public int removeDuplicated(int[] nums){
        int i = 0;
        for(int j = 0; j < nums.length; j++){
            if(nums[j] != nums[i]){
                nums[++i] = nums[j];
            }
        }

        return i+1;
    }
    public static void main(String[] args) {
        RemDupSortedArr remover = new RemDupSortedArr();
        int[] nums = {1, 1, 2, 2, 3, 4, 4};
        int newLength = remover.removeDuplicated(nums);

        // Print the modified array
        for(int k = 0; k < newLength; k++){
            System.out.print(nums[k] + " ");
        }
    }
}
