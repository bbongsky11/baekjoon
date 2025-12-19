import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int loop = Integer.parseInt(br.readLine());
        int cnt = 0;
        String[] s = br.readLine().split(" ");

        for (String a : s) {
            int num = Integer.parseInt(a);

            int sosu = 0;
            for (int k = 1; k < num; k++ ) {
                if (num % k == 0) {
                    sosu++;
                }
            }

            if (sosu == 1) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}