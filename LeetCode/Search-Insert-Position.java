1class Solution {
2    public int searchInsert(int[] nums, int target) {
3        int left = 0;
4        int right = nums.length - 1;
5
6        while (left <= right) {
7            int mid = left + (right - left) / 2;
8
9            if (nums[mid] == target) {
10                return mid;
11            } 
12            else if (nums[mid] < target) {
13                left = mid + 1;
14            } 
15            else {
16                right = mid - 1;
17            }
18        }
19
20        // target not found → left is correct insert position
21        return left;
22    }
23}