import java.io.*;
import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();

        list.add(0);
        list.add(1);

        for (int i = 0; i < n; i++) {
            list.add((list.get(i) + list.get(i+1))  % 1234567 );
        }

        answer = list.get(n);
            
        return answer;
    }
    
}