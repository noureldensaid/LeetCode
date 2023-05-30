class Solution {
 public int maxArea(int[] height) {
    int h = 0;
    int w = 0;
    int left = 0;
    int area = 0;
    int right = height.length - 1;
    while (left < right) {
        w = right - left;  // Calculate the width correctly
        h = Math.min(height[left], height[right]);  // Calculate the minimum height
        area = Math.max(area, h * w);
        if (height[left] < height[right]) {
            left++;
        } else {
            right--;
        }
    }
    return area;
}

}