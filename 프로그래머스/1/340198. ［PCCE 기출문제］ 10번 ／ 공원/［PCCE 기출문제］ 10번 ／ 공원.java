import java.util.Arrays;

class Solution {
    public int solution(int[] mats, String[][] park) {
        // int answer = 0;
        Arrays.sort(mats);
        
        int x = park[0].length;
        int y = park.length;
        
        for (int i = mats.length - 1; i >= 0; i--) {
            int size = mats[i];
            
            for(int start = 0; start <= y - size; start++) {
                for(int end = 0; end <= x - size; end++) {
                    boolean check = true;
                    
                    for (int j = start; j < start + size; j++) {
                        for(int k = end; k < end + size; k++){
                            if(!park[j][k].equals("-1")) {
                                check = false; 
                                break;
                            }
                        }
                        if(!check) break;
                    }
                    
                    if(check) return size;
                }
                
            }
        }
            
        return -1;
    }
}