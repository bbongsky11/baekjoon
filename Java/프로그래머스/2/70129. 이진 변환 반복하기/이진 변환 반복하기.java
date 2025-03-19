class Solution {
    public int[] solution(String s) {
        int zeroCnt = 0;
        int count = 0;

        while (s.length() > 1) {
            int length = s.length();
            s = s.replaceAll("0", "");
            int cnt = length - s.length(); // 제거할 0의 개수 /// 제거 후 개수는 s.length()
            zeroCnt += cnt;

            s = binary(s.length());
            count++;
        }

        int[] answer = {count, zeroCnt};

        System.out.println(answer[0] + " " + answer[1]);
        return answer;
    }
    
    private static String binary(int n) {
        StringBuilder sb = new StringBuilder();
        while(n > 1){
            sb.append(n % 2);
            n /= 2;
        }
        sb.append(n);
        return sb.reverse().toString();
    }
    
}