class Solution {
    public int solution(int origin) {
        
        int answer = 0;
        long num = origin;
        
        for(int i = 0; i < 500; i++) {
            
            if(num == 1) return answer;
            
            answer++;
            
            if(num % 2 == 0) {
                num /= 2;
                continue;
            }
            num = (num * 3) + 1;
        }
        
        return -1;
    }
}