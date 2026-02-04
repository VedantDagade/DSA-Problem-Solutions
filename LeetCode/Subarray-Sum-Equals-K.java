1class Solution {
2    public int subarraySum(int[] nums, int k) {
3
4        Map<Integer,Integer> map = new HashMap<>();
5        
6        map.put(0,1); // prefix sum 0 occurs once → handles subarrays starting at index 0
7
8        int count = 0, sum = 0;
9
10        for(int num : nums){
11            sum += num; // running prefix sum
12
13            int rem = sum - k; // we need a previous prefix = sum-k
14
15            if(map.containsKey(rem)){
16                count += map.get(rem); // add all matching subarrays
17            }
18
19            map.put(sum , map.getOrDefault(sum,0) + 1); // store frequency of prefix sum
20        }
21
22        return count; // total subarrays with sum k
23    }
24}
25