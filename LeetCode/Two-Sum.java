1class Solution {
2    public int[] twoSum(int[] nums, int target) {
3        int n = nums.length;
4
5        HashMap<Integer , Integer> map = new HashMap<>();
6
7        for(int i = 0; i < n; i++){
8            int complement = target - nums[i];
9
10            if(map.containsKey(complement)){
11                return new int[]{map.get(complement) , i};
12            }else{
13                map.put(nums[i] , i);
14            }
15        }
16
17        return new int[]{-1,-1};
18    }
19}