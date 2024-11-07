import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        
        Map<String, Integer> nameScore = new HashMap<String, Integer>();
        
        for(int i = 0; i < name.length; i++) {
            nameScore.put(name[i], yearning[i]);
        }
        
        int[] answer = new int[photo.length];
        
        for(int i = 0; i < photo.length; i++) {
            
            for(String nm : photo[i]) {
                
                if(nameScore.get(nm) == null) continue;
                
                answer[i] += (int)nameScore.get(nm);
            }
        }
        
        return answer;
    }
}