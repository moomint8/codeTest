import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        
        int answer = 0;
        int min = limit;
        
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i <= limit; i++) {
            map.put(i, 0);
        }
        
        for(int i = 0; i < people.length; i++) {
            map.put(people[i], map.get(people[i]) + 1);
            min = Math.min(min, people[i]);
        }
        
        for(int i = limit; i >= min; i--) {
            
            while(map.get(i) > 0) {
                map.put(i, map.get(i) - 1);
                for(int j = limit - i; j >= min; j--) {
                    if(map.get(j) != 0) {
                        map.put(j, map.get(j) - 1);
                        break;
                    }
                }
                answer++;
            }
        }
        
        return answer;
    }
}