import java.util.*;
class Solution {
    public String solution(int[] numbers) {
        String[] answer = new String[numbers.length];
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < numbers.length; i++) {
            answer[i] = String.valueOf(numbers[i]);
        }
        
        Arrays.sort(answer, (s1, s2) -> (s2 + s1).compareTo(s1 + s2));
        
        for(String s : answer) {
            sb.append(s);
        }
        
        if("0".equals(answer[0])) return "0";
        
        return sb.toString();
    }
}