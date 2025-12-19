import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int p = sc.nextInt();
        int q = sc.nextInt();
        List<Integer> list = new ArrayList<Integer>();

        for (int i = 1; i <= p; i++) {
            if (p % i == 0) {
                list.add(i);
            }
        }

        if (list.size() != 0 && list.size() >= q) {
            System.out.println(list.get(q-1));
        } else {
            System.out.println('0');
        }

        sc.close();
    }
}