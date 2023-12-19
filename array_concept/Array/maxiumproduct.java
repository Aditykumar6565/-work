public class maximumproduct {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int left = 0;
        int right = height.length - 1;

        while (left < right) {
            int currentArea = Math.min(height[left], height[right]) * (right - left);
            maxArea = Math.max(maxArea, currentArea);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }

    public static void main(String[] args) {
        maximumproduct container = new maximumproduct();

        int[] height1 = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(container.maxArea(height1));  // Output: 49

        int[] height2 = {1, 1};
        System.out.println(container.maxArea(height2));  // Output: 1
    }
}
