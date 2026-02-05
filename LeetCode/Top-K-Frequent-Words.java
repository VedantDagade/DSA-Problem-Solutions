1class Solution {
2    public List<String> topKFrequent(String[] words, int k) {
3
4        Map<String,Integer> map = new HashMap<>();
5
6        for(String s : words){
7            map.put(s, map.getOrDefault(s,0) + 1);
8        }
9
10        List<Map.Entry<String,Integer>> list = new ArrayList<>(map.entrySet());
11
12        //sort by freq(desc) + lexicographical(asc)
13        list.sort((a,b) ->{ 
14            if(!b.getValue().equals(a.getValue())){
15               return b.getValue() - a.getValue();    // higher freq first
16            }
17            return a.getKey().compareTo(b.getKey());   // alphabetical tie-break
18        });
19
20       
21        List<String> ans = new ArrayList<>();
22
23        for(int i = 0; i < k; i++){
24            ans.add(list.get(i).getKey());
25        }
26
27        return ans;       
28    }
29}
30