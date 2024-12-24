import java.util.*;

class Solution {
    public String solution(String s, String skip, int index) {
        
        String answer = "";
        
        for(int i = 0; i < s.length(); i++) {
            
            char target = s.charAt(i);
            for(int j = 0; j < index; j++) {
                target++;
                if(target > 'z') target -= 26;
                if(skip.contains(target + "")) j--;
            }
            
            answer += target;
        }
        
        return answer;
    }
}