class Solution {
    boolean solution(String s) {
        
        boolean answer = true;
        
        if(s.charAt(0) == ')') return false;
        if(s.charAt(s.length() - 1) == '(') return false;
        
        int cnt = 1;
        
        for(int i = 1; i < s.length(); i++) {
            
            if(s.charAt(i) == ')') {
                
                if(cnt == 0) return false;
                
                cnt--;
                continue;
            }
            cnt++;
        }
        
        if(cnt == 0) return true;

        return false;
    }
}