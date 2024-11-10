class Solution {
    
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        
        int firstCnt = 0;
        int secondCnt = 0;
        
        for(String target : goal) {
            
            if(firstCnt < cards1.length && target.equals(cards1[firstCnt])) {
                firstCnt++;
                continue;
            }
            
            if(secondCnt < cards2.length && target.equals(cards2[secondCnt])) {
                secondCnt++;
                continue;
            }
            
            return "No";
        }
        
        return "Yes";
    }
}