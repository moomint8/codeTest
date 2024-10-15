import java.util.*;

class Solution {
    public String[] solution(String[] record) {
        
        Map<String, String> userNick = new HashMap<String, String>();
        
        int resultSize = 0;
        
        for(String str : record) {
            String[] rec = str.split(" ");
            
            if(rec[0].charAt(0) == 'L') {
                resultSize++;
                continue;
            }
            
            userNick.put(rec[1], rec[2]);
            
            if(rec[0].charAt(0) == 'E') {
                resultSize++;
                continue;
            }            
        }
        
        String[] answer = new String[resultSize];
        
        int cnt = 0;
        
        for(int i = 0; i < record.length; i++) {
            String[] rec = record[i].split(" ");
            
            if(rec[0].charAt(0) == 'C') {
                continue;
            }
            if(rec[0].charAt(0) == 'E') {
                answer[cnt] = userNick.get(rec[1]) + "님이 들어왔습니다.";
                cnt++;
                continue;
            }
            answer[cnt] = userNick.get(rec[1]) + "님이 나갔습니다.";
            cnt++;
        }
        
        return answer;
    }
}