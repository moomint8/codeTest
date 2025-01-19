class Solution {
    public int solution(int n) {
        
        int temp = 0;
        int before = 0;
        int after = 1;
        
        for(int i = 2; i <= n; i++) {
            temp = after;
            after = (before + after) % 1234567;
            before = temp;
        }        
        
        return after;
    }
}