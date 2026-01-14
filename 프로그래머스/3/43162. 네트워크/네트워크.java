class Solution {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] visit = new boolean[n];
        
        for(int i = 0; i < n; i++){
            if(!visit[i]) {
                dfs(computers, visit, i);
                answer++;
            }
        }
        return answer;
    }
    
    public void dfs(int[][] computers, boolean[] visit, int current) {
        visit[current] = true;
        
        for(int i = 0; i < computers.length; i++) {
            if(current != i && !visit[i] && computers[current][i] == 1) {
                dfs(computers, visit, i);
            }
        }
    }
}