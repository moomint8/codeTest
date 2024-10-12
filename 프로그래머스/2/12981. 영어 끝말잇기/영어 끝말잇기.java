import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {0, 0};

        Set<String> isExist = new HashSet<String>();
        
        isExist.add(words[0]);
        
        for(int i = 1; i < words.length; i++) {
            if(words[i - 1].charAt(words[i - 1].length() - 1) == words[i].charAt(0) &&
              !isExist.contains(words[i])) {
                isExist.add(words[i]);
                continue;
            }
            answer[0] = (i % n) + 1;
            answer[1] = (i / n) + 1;
            break;
        }        

        return answer;
    }
}