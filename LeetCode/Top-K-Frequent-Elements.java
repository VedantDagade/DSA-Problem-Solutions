1class Solution {
2    public int[] topKFrequent(int[] nums, int k) {
3
4        Map<Integer,Integer> map = new HashMap<>();
5        for(int num : nums){
6            map.put(num, map.getOrDefault(num, 0) + 1);
7        }
8
9        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());   //map to list
10
11        //sort by descending order
12        list.sort((a,b) -> b.getValue() - a.getValue());
13
14        //Pick top k frequent elements
15        int[] arr = new int[k];
16
17        for(int i = 0; i < k; i++){
18            arr[i] = list.get(i).getKey();
19        }
20
21        return arr;
22    }
23}
24