
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int p = sc.nextInt();
            if (p == -1) return;

            int sum = 0;
            List<Integer> list = new ArrayList<>();

            for (int i = 1; i <= p; i++) {
                if (p % i == 0 && p != i) {
                    list.add(i);
                    sum += i;
                }
            }

            if (sum == p) {
                System.out.print(p + " = " + list.get(0));
                for (int i = 1; i < list.size(); i++) {
                    System.out.print(" + " + list.get(i));
                }
                System.out.println();
            } else {
                System.out.println(p + " is NOT perfect.");
            }

        }

    }
}
