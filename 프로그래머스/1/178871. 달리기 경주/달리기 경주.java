import java.util.Map;
import java.util.HashMap;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        
        Map<String, Integer> name = new HashMap<String, Integer>();
        Map<Integer, String> num = new HashMap<Integer, String>();
        
        for(int i = 0; i < players.length; i++) {
            
            name.put(players[i], i);
            num.put(i, players[i]);
        }
        
        for(int i = 0; i < callings.length; i++) {
            
            String winner = callings[i];
            int winnerNum = name.get(winner);
            String loser = num.get(winnerNum - 1);
            
            name.put(winner, winnerNum - 1);
            name.put(loser, winnerNum);
            num.put(winnerNum - 1, winner);
            num.put(winnerNum, loser);
        }
        
        for(int i = 0; i < players.length; i++) {
            
            players[i] = num.get(i);
        }
        
        return players;
    }
}