class Solution {
    
    private int num;
    
    public String solution(String s, int n) {
        
        String answer = "";
        num = n;
        
        for(int i = 0; i < s.length(); i++) {
            
            char target = s.charAt(i);
            
            if(target == ' ') {
                answer += ' ';
                continue;
            }
            answer += caesar(target);
        }
        
        return answer;
    }
    
    private char caesar(char target) {
        
        boolean isSmall = target >= 97;
        target += num;
        
        if(isSmall && target > 122 ||
           !isSmall && target > 90) {
            target -= 26;
        }
        
        return target;
    }
}