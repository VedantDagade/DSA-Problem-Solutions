1class Solution {
2    public int minSubArrayLen(int target, int[] nums) {
3        int n = nums.length;
4        int left = 0;
5        int minLen = Integer.MAX_VALUE;
6
7        int sum = 0;
8
9        for(int i = 0; i < n; i++){
10            sum += nums[i];
11
12            while(sum >= target){
13                minLen = Math.min(minLen , i - left + 1);
14                sum -= nums[left];
15                left++;
16            }
17        }
18
19        return minLen == Integer.MAX_VALUE ? 0 : minLen;        
20    }
21}