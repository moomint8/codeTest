class Solution {    
    public int solution(int[] bandage, int health, int[][] attacks) {
        
        int maxHealth = health;
        int time = 0;
        int bonusCnt = 0;
        
        for(int[] attack : attacks) {
            
            while(time < attack[0]) {
                
                health += bandage[1];
                bonusCnt++;
                time++;
                
                if(bonusCnt == bandage[0]) {
                    health += bandage[2];
                    bonusCnt = 0;
                }
                
                if(health >= maxHealth) {
                    health = maxHealth;
                    time = attack[0];
                    break;
                }
            }
            
            health -= attack[1];
            if(health <= 0) return -1;
            
            bonusCnt = 0;
            time++;
        }
        
        return health;
    }
}