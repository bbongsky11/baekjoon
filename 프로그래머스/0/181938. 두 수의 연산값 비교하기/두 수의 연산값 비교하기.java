class Solution {
    public int solution(int a, int b) {
        int sum = Integer.parseInt(Integer.toString(a) + Integer.toString(b));
        int multiply = 2 * a * b;
        if( sum >= multiply ) {
            return sum;
        } else {
            return multiply;
        }
    }
}