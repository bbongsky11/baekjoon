import java.util.*;
class Solution {
    public int[] solution(int brown, int yellow) {
       int num = brown + yellow;
       List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= num; i++) {
            if( num % i == 0) {
                list.add(i);
            }
        }
         int[] answer = {} ;

        for (int i = 0; i < list.size(); i++) {
            int n = list.get((list.size() / 2) + i);
            System.out.println(n);
            int m = list.get(((list.size() -1 ) / 2) - i);
            if (n >= m && (((m - 2) * 2) + ((n - 2) * 2) + 4) == brown) {
                answer = new int[] {n, m};
                break;
            }
        }
        
        return answer;
    }
}