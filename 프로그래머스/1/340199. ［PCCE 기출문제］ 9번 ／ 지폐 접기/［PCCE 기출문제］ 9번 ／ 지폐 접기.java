import java.util.*;

class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        
        int minWallet = Math.min(wallet[0], wallet[1]);
        int maxWallet = Math.max(wallet[0], wallet[1]);
        
        while(true) {
            
            int minBill = Math.min(bill[0], bill[1]);
            int maxBill = Math.max(bill[0], bill[1]);
            
            if(maxWallet >= maxBill && minWallet >= minBill) break;
            
            bill[0] = minBill;
            bill[1] = maxBill / 2;
            answer++;
        }
        
        return answer;
    }
}