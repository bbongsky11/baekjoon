class Solution {
    public int solution(int n, int w, int num) {
        // 택배 상자의 개수 n
        // 가로 상자 개수 w
        // 꺼내려는 상자 번호 num
        int y = (n / w) + 1;
        int[][] arr = new int[y][w];
        int count = 1; 
        int col = 0;
        int row = 0;
        
        for (int i = 0; i < y; i++) {
            if (i % 2 == 0) {
                for(int j = 0; j < w; j++) {
                    if(count > n) break;
                    
                    if(count == num) {
                        col = i;
                        row = j;
                    }
                    
                    arr[i][j] = count++;
                }
            } else {
                for(int j = w-1; j >= 0; j--) {
                    if(count > n) break;
                    
                    if(count == num) {
                        col = i;
                        row = j;
                    }
                    
                    arr[i][j] = count++;
                }
            }
        }
        
        int result = 0;
        for(int i = col; i < y; i++) {
            if(arr[i][row] != 0) {
                result++;
            }
        }
        return result;
    }
}