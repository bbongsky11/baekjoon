import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        int sum = 0;
        int min = n;

        for (int num = m; num <= n; num++) {
            if (isCheck(num)) {
                sum += num;
                if (min > num) min = num;
            }
        }

        if (sum == 0) System.out.println("-1");
        else {
            System.out.println(sum);
            System.out.println(min);
        }
    }

    public static boolean isCheck(int num) {
        if (num < 2) return false;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
