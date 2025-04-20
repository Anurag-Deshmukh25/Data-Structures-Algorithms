package BinarySearch;

import java.util.Arrays;

public class FirstandLastOcc {
    public int searchLeft(int[] nums, int target){
        int left = 0, right = nums.length - 1, mid = 0;
        int index = -1;
        while(left <= right){
            mid = left + (right - left) / 2;
            if(nums[mid] == target){
                index = mid;
                right = mid - 1;
            }else if(nums[mid] < target){
                left = mid + 1;
            }else right = mid - 1;
        }

        return index;
    }
    public int searchRight(int[] nums, int target){
        int left = 0, right = nums.length - 1, mid = 0;
        int index = -1;
        while(left <= right){
            mid = left + (right - left) / 2;
            if(nums[mid] == target){
                index = mid;
                left = mid + 1;
            }else if(nums[mid] < target){
                left = mid + 1;
            }else right = mid - 1;
        }

        return index;
    }

    public int[] searchRange(int[] nums, int target) {
        int left = searchLeft(nums, target), right = searchRight(nums, target);

        return new int[]{left, right};
    }

    public static void main(String[] args) {
        FirstandLastOcc firstandlastoc = new FirstandLastOcc();
        int[] nums = {5, 7, 7, 8, 8, 8, 9, 10};
        int target = 8;
         int[] result = firstandlastoc.searchRange(nums, target);
         System.out.println(Arrays.toString(result));
    }
}
