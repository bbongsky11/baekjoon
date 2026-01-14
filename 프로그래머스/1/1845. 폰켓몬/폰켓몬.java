import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = nums.length / 2;
        Map<Integer, Integer> num = new HashMap<>();
        
        for(int n : nums) {
            num.put(n, num.getOrDefault(n, 0) + 1);
        }
        
        if(answer > num.size()) 
            answer = num.size();
        
        return answer;
    }
}