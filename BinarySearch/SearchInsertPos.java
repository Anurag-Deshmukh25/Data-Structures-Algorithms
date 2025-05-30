package binarysearch;

public class SearchInsertPos {
    public int searchInsertPos(int[] nums, int target){
        int left = 0, right = nums.length - 1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(nums[mid] == target) return mid;
            else if(nums[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return left;
    }
    public static void main(String[] args) {
        SearchInsertPos searcher = new SearchInsertPos();
        int[] nums = {1, 3, 5, 6};
        int target = 5;
        int position = searcher.searchInsertPos(nums, target);
        
        System.out.println("Insert Position: " + position); // Output: 2
    }
}
