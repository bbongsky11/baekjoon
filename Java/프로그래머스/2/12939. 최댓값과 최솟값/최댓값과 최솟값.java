import java.io.*;
import java.util.ArrayList;
import java.util.List;

class Solution {
    public String solution(String s) {
        List<Integer> list = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        String[] string = s.split(" ");
            
        for(String text : string) {
            list.add(Integer.parseInt(text));
        }
        
        for (int i : list) {
            if (i > max) max = i;
            if (i < min) min = i;  
        }
        
        String answer = min + " " + max ;
        return answer;
    }
}