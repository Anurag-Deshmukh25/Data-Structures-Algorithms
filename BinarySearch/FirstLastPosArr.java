package binarysearch;

public class FirstLastPosArr {

    public int searchLeft(int[] nums, int target){
        int left = 0, right = nums.length - 1;
        int firstPos = -1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(nums[mid] == target){
                firstPos = mid;
                right = mid - 1;
            }else if(nums[mid] < target) left = mid + 1;
            else right = mid - 1;
        }

        return firstPos;
    }

    public int searchRight(int[] nums, int target){
        int left = 0, right = nums.length - 1;
        int lastPos = -1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(nums[mid] == target){
                lastPos = mid;
                left = mid + 1;
            }else if(nums[mid] < target) left = mid + 1;
            else right = mid - 1;
        }

        return lastPos;
    }

    public int[] searchRange(int[] nums, int target){
        int firstPos = searchLeft(nums, target);
        int lastPos = searchRight(nums, target);

        return new int[] {firstPos, lastPos};
    }

    public static void main(String[] args) {
        FirstLastPosArr finder = new FirstLastPosArr();
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        int[] result = finder.searchRange(nums, target);
        
        System.out.println("First Position: " + result[0]);
        System.out.println("Last Position: " + result[1]);
    }
}
