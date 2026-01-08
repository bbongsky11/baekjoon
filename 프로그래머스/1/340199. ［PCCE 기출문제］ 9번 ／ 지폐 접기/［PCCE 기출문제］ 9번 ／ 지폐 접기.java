class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        int wMin = Math.min(wallet[0], wallet[1]);
        int wMax = Math.max(wallet[0], wallet[1]);
        int bMin = Math.min(bill[0], bill[1]);
        int bMax = Math.max(bill[0], bill[1]);
        
        while(true) {
            if(bMin > wMin || bMax > wMax) {
                bMax /= 2;
                answer++;
            }
            
            if(bMin > bMax) {
                int temp = bMin;
                bMin = bMax;
                bMax = temp;
            }
            
            if(wMax >= bMax && wMin >= bMin){
                break;
            }
        }
        
        return answer;
    }
}