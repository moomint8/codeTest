import java.util.Stack;

class Solution
{
    public int solution(String s)
    {
        Stack<Character> stack = new Stack<>();
        
        for(int i = 0; i < s.length(); i++) {
            
            char target = s.charAt(i);
            if(stack.isEmpty() || stack.peek() != target) {
                stack.push(target);
                continue;
            }        
            
            stack.pop();            
        }
        
        if(stack.isEmpty()) return 1;
        
        return 0;
    }
}