class Solution {
    boolean solution(String s) {
        boolean answer = true;

        int lCnt = 0;
        for (String c : s.split("")) {
            if (c.equals("(")) {
                lCnt++;
            } else if (lCnt > 0 && c.equals(")")) {
                lCnt--;
            } else if (lCnt <= 0 && c.equals(")")) {
                return false;
            }
        }
        if (lCnt != 0) {
            answer = false;
        }

        return answer;
    }
}