package Arrays;

public class ProductOfArrExSelf {
    public int[] productExceptSelf(int[] nums){
        int n = nums.length;
        int[] result = new int[n];
        for(int i = 0; i < n; i++) result[i] = 1;

        for(int i = 1; i < n; i++){
            result[i] = result[i-1] * nums[i-1];
        }

        int suffix = 1;
        for(int i = n - 2; i >= 0; i--){
            suffix *= nums[i+1];
            result[i] *= suffix;
        }

        return result;
    }

    public static void main(String[] args) {
        ProductOfArrExSelf productCalculator = new ProductOfArrExSelf();
        int[] nums = {1, 2, 3, 4};
        int[] result = productCalculator.productExceptSelf(nums);

        // Print the result
        for(int value : result){
            System.out.print(value + " ");
        }
    }
}
