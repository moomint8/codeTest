class Solution {
    public int solution(int number, int limit, int power) {
        
        int[] knights = new int[number + 1];
        
        for(int i = 1; i <= number; i++) {
            
            int target = i;
            
            while(target <= number) {
                
                knights[target]++;
                target += i;
            }
        }
        
        int answer = 0;
        
        for(int i = 1; i <= number; i++) {
            
            int damage = knights[i];
            
            if(damage > limit) {
                
                answer += power;
                continue;
            }
            
            answer += damage;
        }
        
        return answer;
    }
}