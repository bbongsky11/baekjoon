class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String sum1 = a + "" + b;
        String sum2 = b + "" + a;
        if(Integer.parseInt(sum1) > Integer.parseInt(sum2)) {
            answer = Integer.parseInt(sum1);
        } else {
            answer = Integer.parseInt(sum2);
        }
        
        System.out.println(answer);
        return answer;
    }
}