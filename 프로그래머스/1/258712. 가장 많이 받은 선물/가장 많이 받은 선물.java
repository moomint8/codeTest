import java.util.*;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        int answer = 0;
        
        int friendNum = friends.length;
        Map<String, Integer> friendLoc = new HashMap<String, Integer>();
        
        for(int i = 0; i < friendNum; i++) {
            friendLoc.put(friends[i], i);
        }
        
        int[] giftPoint = new int[friendNum];
        int[][] giftTable = new int[friendNum][friendNum];
        
        for(String gift : gifts) {
            String[] target = gift.split(" ");
            giftPoint[friendLoc.get(target[0])]++;
            giftPoint[friendLoc.get(target[1])]--;
            giftTable[friendLoc.get(target[0])][friendLoc.get(target[1])]++;
        }
        
        for(int i = 0; i < friendNum; i++) {
            int sum = 0;
            
            for(int j = 0; j < friendNum; j++) {
                
                if(i == j) continue;
                
                if(giftTable[i][j] > giftTable[j][i] ||
                   (giftTable[i][j] == giftTable[j][i] && (giftPoint[i] > giftPoint[j]))) {
                    sum++;
                }
            }
            
            if(sum > answer) answer = sum;
        }
        
        return answer;
    }
}