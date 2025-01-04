class Solution {
    public int[] solution(String s) {
        
        int[] answer = {0, 0};
        
        while(s.length() > 1) {
            
            answer[0]++;
            int oneCnt = 0;
            
            for(int i = 0; i < s.length(); i++) {
                if(s.charAt(i) == '0') {
                    answer[1]++;
                    continue;
                }
                oneCnt++;
            }
            
            s = Integer.toBinaryString(oneCnt);
        }
        
        return answer;
    }
}