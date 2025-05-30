package Arrays;

public class ContainerWater {
    public int maxArea(int[] heights){
        int left = 0, right = heights.length - 1;
        int maxArea = 0;
        while(left < right){
            maxArea = Math.max(Math.min(heights[left], heights[right]) * (right - left), maxArea);

            if(heights[left] < heights[right]) left++;
            else right--;
        }

        return maxArea;
    }

    public static void main(String[] args) {
        ContainerWater containerWater = new ContainerWater();
        int[] heights = {1,8,6,2,5,4,8,3,7};
        System.out.println("Maximum area: " + containerWater.maxArea(heights)); // Output: 49
    }
}
