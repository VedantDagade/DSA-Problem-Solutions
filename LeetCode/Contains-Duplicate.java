1class Solution {
2    public boolean containsDuplicate(int[] nums) {
3        int n = nums.length;
4
5        Map<Integer,Integer> map = new HashMap<>();
6
7        for(int i = 0; i < n; i++){
8            map.put(nums[i] , map.getOrDefault(nums[i], 0) + 1);
9        }
10
11        for(Map.Entry<Integer,Integer> it : map.entrySet()){
12            if(it.getValue() > 1){
13                return true;
14            }
15        }
16
17        return false;
18    }
19}