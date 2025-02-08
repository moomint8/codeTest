class Solution {
    public String solution(String X, String Y) {
        
        int[] xCnt = new int[10];
        int[] yCnt = new int[10];
        
        for(int i = 0; i < X.length(); i++) {
            xCnt[X.charAt(i) - '0']++;
        }
        for(int i = 0; i < Y.length(); i++) {
            yCnt[Y.charAt(i) - '0']++;
        }
        
        StringBuilder answer = new StringBuilder();
        
        for(int i = 9; i >= 0; i--) {
            for(int j = 0; j < Math.min(xCnt[i], yCnt[i]); j++) answer.append(i);
        }
        
        if(answer.toString().equals("")) return "-1";
        if(answer.toString().charAt(0) == '0') return "0";
        return answer.toString();
    }
}