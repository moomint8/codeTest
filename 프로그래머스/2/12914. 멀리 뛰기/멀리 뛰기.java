class Solution {
    public long solution(int n) {
        
        int temp = 0;
        int before = 1;
        int after = 2;
        
        if(n == 1) return 1;
        
        for(int i = 3; i <= n; i++) {
            temp = after;
            after = (before + after) % 1234567;
            before = temp;
        }        
        
        return after;
    }
}