class Solution {
    public String solution(String[] seoul) {
        
        return "김서방은 " + findLoc(seoul, "Kim") + "에 있다";
    }
    
    private int findLoc(String[] loc, String target) {
        
        for(int i = 0; i < loc.length; i++) {
            
            if(loc[i].equals(target)) return i;
        }
        
        return -1;
    }
}