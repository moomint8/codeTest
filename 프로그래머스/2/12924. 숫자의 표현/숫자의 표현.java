class Solution {
    public int solution(int n) {
        
        int answer = 0;
        int[] sum = new int[n + 1];
        
        for(int i = 1; i < sum.length; i++) {
            sum[i] = sum[i - 1] + i;
        }
        
        int left = 0;
        int right = 1;
        
        while(right < sum.length) {
            
            if(sum[right] - sum[left] < n) {
                right++;
                continue;
            }
            
            if(sum[right] - sum[left] == n) {
                answer++;
                left++;
                right++;
                continue;
            }
            
            if(sum[right] - sum[left] > n) {
                left++;
            }
        }
        
        return answer;
    }
}