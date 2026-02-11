1class Solution {
2    public boolean isValid(String s) {
3        Stack<Character> stack = new Stack<>();
4
5        for (char ch : s.toCharArray()) {
6
7            if (ch == '(' || ch == '{' || ch == '[') {
8                stack.push(ch);
9            } else {
10
11                if (stack.isEmpty())
12                    return false;
13
14                char top = stack.pop();
15
16                if ((ch == ')') && top != '(' ||
17                        ((ch == '}') && top != '{' ||
18                                ((ch == ']') && top != '['))) {
19                    return false;
20                }
21            }
22        }
23
24        return stack.isEmpty() ? true : false;
25    }
26}