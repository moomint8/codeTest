class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = isRight(id_pw, db);      
        
        return answer;
    }
    
    private String isRight(String[] id_pw, String[][] db) {
        
        for(int i = 0; i < db.length; i++) {
            if(db[i][0].equals(id_pw[0])) {
                if(db[i][1].equals(id_pw[1])) return "login";
                return "wrong pw";
            }
        }
        
        return "fail";
    }
}