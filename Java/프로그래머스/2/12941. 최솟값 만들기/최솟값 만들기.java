import java.util.*;

class Solution
{
    public int solution(int []A, int []B)
    {
        Arrays.sort(A);
        Arrays.sort(B);
        
        int answer = 0;
        
        for (int i = 1; i <= B.length; i++) {
            answer += A[B.length-i] * B[i-1];
        }

        return answer;
    }
}