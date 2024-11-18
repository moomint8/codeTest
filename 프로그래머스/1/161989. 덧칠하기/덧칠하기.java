class Solution {
    public int solution(int n, int m, int[] section) {
        
        int answer = 0;
        int done = 0;
        
        for(int loc : section) {
            
            if(loc <  done) continue;
            
            answer++;
            done = loc + m;
        }
        
        return answer;
    }
}