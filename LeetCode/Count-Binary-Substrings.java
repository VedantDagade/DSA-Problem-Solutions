1class Solution {
2    public int countBinarySubstrings(String s) {
3        
4        int prev = 0;
5        int curr = 1;
6        int result = 0;
7
8        for(int i = 1; i < s.length(); i++){
9
10            if(s.charAt(i) == s.charAt(i-1)){
11                curr++;
12            }else{
13                result += Math.min(prev,curr);
14                prev = curr;
15                curr = 1;
16            }
17        }
18
19        result += Math.min(prev,curr);
20
21        return result;
22    }
23}