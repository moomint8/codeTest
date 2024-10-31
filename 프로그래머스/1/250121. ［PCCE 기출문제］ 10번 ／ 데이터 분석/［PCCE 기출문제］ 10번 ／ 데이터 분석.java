import java.util.*;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        
        int target = getTarget(ext);
        int sortTarget = getTarget(sort_by);
        List<Integer> sortNum = new ArrayList(){};
        
        int cnt = 0;
        
        for(int[] arr : data) {
            
            if(arr[target] >= val_ext) {
                arr[0] = -1;
                continue;
            }
            
            sortNum.add(arr[sortTarget]);
            cnt++;
        }
        
        Collections.sort(sortNum);
        
        int[][] answer = new int[cnt][4];
        
        for(int[] arr : data) {
            
            if(arr[0] == -1) continue;
            
            int loc = sortNum.indexOf(arr[sortTarget]);
            
            for(int i = 0; i < 4; i++) {
                answer[loc][i] = arr[i];
            }
            loc++;
        }
        
        return answer;
    }
    
    private int getTarget(String ext) {
        switch(ext) {
            case "date": return 1;
            case "maximum": return 2;
            case "remain": return 3;
        }
        return 0;
    }
}