import java.util.*;

class Solution
{
    public int solution(int n, int a, int b)
    {
        double answer = Math.log(get(n, a, b)) / Math.log(2);

        return (int) answer;
    }
    
    private int get(int n, int a, int b) {
        
        int half = n / 2;
        
        if(a > half && b  > half) {
            return get(half, a - half, b - half);
        } else if(a <= half && b <= half) {
            return get(half, a, b);
        }
        return n;
    }
}