import java.util.*;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        
        int unknownNum = 0;
        int correctNum = 0;
        Set<Integer> myNum = new HashSet<Integer>();
        
        for(int i = 0; i < lottos.length; i++) {
            
            if(lottos[i] == 0) {
                unknownNum++;
                continue;
            }
            myNum.add(lottos[i]);
        }
        
        for(int i = 0; i < win_nums.length; i++) {
            
            if(myNum.contains(win_nums[i])) {
                correctNum++;
            }
        }
        
        return new int[]{ getResult(correctNum + unknownNum), getResult(correctNum) };
    }
    
    private int getResult(int win) {
        
        return switch (win) {
                case 0, 1 -> 6;
                case 2 -> 5;
                case 3 -> 4;
                case 4 -> 3;
                case 5 -> 2;
                case 6 -> 1;
                default -> 0;
        };
    }
}