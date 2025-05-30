package Arrays;

public class RemoveElement {
    public int removeElement(int[] nums, int val){
        int i = 0;
        for(int j = 0; j < nums.length; j++){
            if(nums[j] != val){
                nums[i++] = nums[j];
            }
        }

        return i;
    }

    public static void main(String[] args) {
        RemoveElement remover = new RemoveElement();
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        int newLength = remover.removeElement(nums, val);

        // Print the modified array
        for(int k = 0; k < newLength; k++){
            System.out.print(nums[k] + " ");
        }
    }
}
