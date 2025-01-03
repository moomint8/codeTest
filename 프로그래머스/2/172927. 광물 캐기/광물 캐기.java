import java.util.*;

class Solution {
    public int solution(int[] picks, String[] minerals) {
        
        int max = Math.min(minerals.length, (picks[0] + picks[1] + picks[2]) * 5);
        int[][] fatigue = new int [max / 5 + 1][3];
        
        int cnt = 0;
        
        for(int i = 0; i < max; i++) {
            
            if(minerals[i].equals("diamond")) {
                fatigue[cnt][0] += 1;
                fatigue[cnt][1] += 5;
                fatigue[cnt][2] += 25;
            } else if(minerals[i].equals("iron")) {
                fatigue[cnt][0] += 1;
                fatigue[cnt][1] += 1;
                fatigue[cnt][2] += 5;
            } else {
                fatigue[cnt][0] += 1;
                fatigue[cnt][1] += 1;
                fatigue[cnt][2] += 1;
            }
            
            if(i % 5 == 4) cnt++;
        }
        
        Arrays.sort(fatigue, (o1, o2) -> (o2[2] - o1[2]));
        
        int answer = 0;
        int diamondMax = picks[0];
        int ironMax = picks[0] + picks[1];
        
        for(int i = 0; i < fatigue.length; i++) {
            
            if(i < diamondMax) {
                answer += fatigue[i][0];
                continue;
            }
            if(i < ironMax) {
                answer += fatigue[i][1];
                continue;
            }
            answer += fatigue[i][2];
        }
        
        return answer;
    }
}