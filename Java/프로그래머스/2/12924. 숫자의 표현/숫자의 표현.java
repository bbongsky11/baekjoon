class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for (int i = 1; i <= n; i++) {
            int j = 0;
            for (int k = i; k <= n; k++) {
                if (j >= n) {
                    break;
                }
                j += k;
            }
            if (j == n) {
                answer++;
            }
        }
        
        return answer;
    }
}