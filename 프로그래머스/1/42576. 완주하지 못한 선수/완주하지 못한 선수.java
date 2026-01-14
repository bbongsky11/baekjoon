import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> names = new HashMap<>();
        
        for(int i = 0; i < participant.length; i++) {
            names.put(participant[i], names.getOrDefault(participant[i], 0) + 1);
        }
        for(int j = 0; j < completion.length; j++) {
            names.put(completion[j], names.getOrDefault(completion[j], 0) - 1);
        }
        
        for (String fail : names.keySet()) {
            if (names.get(fail) != 0) {
                answer = fail;
                break;
            }
        }
        
        return answer;
    }
}