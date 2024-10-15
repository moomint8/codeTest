import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        
        int[] num = new int[k + 1];
        
        for(int n : score) {
            num[n]++;
        }
        
        int blank = m;
        
        for(int i = k; i > 0; i--) {
            
            if(num[i] > blank) {
                num[i] = num[i] - blank;
                answer += i * m;
                blank = m;
                i++;
                continue;
            }
            
            if(num[i] == blank) {
                num[i] = 0;
                answer += i * m;
                blank = m;
                continue;
            }
            
            blank -= num[i];
        }
        
        return answer;
    }
}