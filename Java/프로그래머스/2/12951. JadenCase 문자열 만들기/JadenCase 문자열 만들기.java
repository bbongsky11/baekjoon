import java.io.*;

class Solution {
    public String solution(String s) {
        
        String answer = "";
        String copy = " " + s;

        for (int i = 1; i < copy.length(); i++) {
            char c = copy.charAt(i-1);
            if (c == ' ') {
                answer += Character.toString(copy.charAt(i)).toUpperCase();
            } else {
                answer += Character.toString(copy.charAt(i)).toLowerCase();
            }
        }

        return answer;
        
    }
}