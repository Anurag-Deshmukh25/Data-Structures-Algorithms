package arrays;

public class MergeSortedArray {
    public void mergeArray(int[] nums1, int m, int[] nums2, int n){
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while(i >= 0 && j >= 0){
            if(nums2[j] > nums1[i]) nums1[k--] = nums2[j--];
            else nums1[k--] = nums1[i--];
        }

        while(j >= 0) nums1[k--] = nums2[j--];
    }

    public static void main(String[] args){
        MergeSortedArray merger = new MergeSortedArray();

        // Example input
        int[] nums1 = {1, 3, 5, 0, 0, 0};
        int[] nums2 = {2, 4, 6};
        int m = 3, n = 3;

        merger.mergeArray(nums1, m, nums2, n);

        // Print the merged array
        System.out.print("Merged array: ");
        for (int num : nums1) {
            System.out.print(num + " ");
        }
    }
}
