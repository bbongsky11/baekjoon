import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        

        String text = br.readLine();
        int line = Integer.parseInt(text.split(" ")[0]);
        int M = Integer.parseInt(text.split(" ")[1]);

        List<Integer> list = new ArrayList<>();

        int[] nums = new int[line];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < line; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        for (int j = 0; j < nums.length; j++) {
            for (int k = j + 1; k < nums.length; k++) {
                for (int l = k + 1; l < nums.length; l++) {
                    int sum = nums[j] + nums[k] + nums[l];
                    if (sum <= M) list.add(sum);
                }
            }
        }

        int result = list.stream().max(Comparator.comparingInt(Integer::intValue)).orElse(0);
        System.out.println(result);
        
    }
}