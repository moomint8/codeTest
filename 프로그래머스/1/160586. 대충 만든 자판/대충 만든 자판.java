import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        
        Map<String, Integer> alpha = new HashMap<String, Integer>();
        
        for(int i = 0; i < keymap.length; i++) {
            
            for(int j = 0; j < keymap[i].length(); j++) {
                
                String key = keymap[i].charAt(j) + "";
                
                if(alpha.containsKey(key) && alpha.get(key) < j + 1) {
                    continue;
                }
                
                alpha.put(key, j + 1);
            }
        }
        
        int[] answer = new int[targets.length];
        
        for(int i = 0; i < targets.length; i++) {
            
            int num = 0;
            
            for(int j = 0; j < targets[i].length(); j++) {
                
                String target = targets[i].charAt(j) + "";
                if(alpha.containsKey(target)) {
                    num += alpha.get(target);
                    continue;
                }
                
                num = -1;
                break;
            }
            
            answer[i] = num;
        }
        
        return answer;
    }
}