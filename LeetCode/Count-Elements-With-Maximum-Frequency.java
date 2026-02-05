1class Solution {
2    public int maxFrequencyElements(int[] nums) {
3        int n = nums.length;
4
5        Map<Integer,Integer> map = new HashMap<>();
6        
7        for(int num : nums){
8            map.put(num, map.getOrDefault(num,0) + 1);
9        }
10
11        int maxF = 0;
12
13        for(int freq : map.values()){
14            maxF = Math.max(maxF, freq); 
15        }
16
17        int result = 0;
18
19        for(int freq : map.values()){
20            if(freq == maxF){
21                result += freq;
22            }
23        }
24
25        return result;
26    }
27}