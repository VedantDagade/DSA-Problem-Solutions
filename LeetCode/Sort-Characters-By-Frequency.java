1class Solution {
2    public String frequencySort(String s) {
3        int n = s.length();
4
5        Map<Character,Integer> map = new HashMap<>();
6
7        for(char ch : s.toCharArray()){
8            map.put(ch , map.getOrDefault(ch,0) + 1);
9        }
10         
11        List<Map.Entry<Character,Integer>> list = new ArrayList<>(map.entrySet());
12
13        list.sort((a,b) -> b.getValue() - a.getValue());
14
15        StringBuilder sb = new StringBuilder();
16
17        for(Map.Entry<Character,Integer> it : list){
18            char ch = it.getKey();
19            int freq = it.getValue();
20
21            for(int i = 0; i < freq; i++){
22                sb.append(ch);
23            }
24            
25        }
26
27        return sb.toString();
28    }
29}