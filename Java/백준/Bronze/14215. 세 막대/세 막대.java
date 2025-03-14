import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            int max = 0;
            int sum = 0;
            if (max < a) {
                max = a;
                sum = b + c;
            }
            if (max < b) {
                max = b;
                sum = a + c;
            }
            if (max < c) {
                max = c;
                sum = a + b;
            }

            if (sum > max) {
                System.out.println(a+b+c);
            } else {
                System.out.println(sum + (sum-1));
            }

    }
}