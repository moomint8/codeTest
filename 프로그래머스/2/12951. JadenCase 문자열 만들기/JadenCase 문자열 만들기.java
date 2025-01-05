import java.util.*;

class Solution {
    public String solution(String s) {
        
        String answer = "";
        String[] arr = s.split(" ");
        
        for(int i = 0; i < arr.length; i++) {
            
            if(arr[i].isEmpty()){
                answer +=  " ";
                continue;
            }
            
            answer += arr[i].substring(0, 1).toUpperCase() + 
                      arr[i].substring(1, arr[i].length()).toLowerCase() + 
                      " ";
        }
        
        if(s.charAt(s.length() - 1) == ' ')
            return answer;
        
        return answer.substring(0, answer.length() - 1);
    }
}