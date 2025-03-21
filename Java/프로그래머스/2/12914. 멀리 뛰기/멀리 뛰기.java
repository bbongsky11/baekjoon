class Solution {
    public long solution(int n) {
        long answer = 0;
        
        int[] list = new int[n + 2];

        for (int i = 0; i < list.length; i++) {
            list[i] = i;
        }

        for (int i = 3; i <= n; i++) {
            list[i] = ((list[i-1] + list[i-2]) % 1234567);
        }
        
        return list[n];
    }
}