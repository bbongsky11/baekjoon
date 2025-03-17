import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Map<Integer, Integer> xCount = new HashMap<>();
        Map<Integer, Integer> yCount = new HashMap<>();
        int x;
        int y;

        for (int j = 0; j < 3; j++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());

            int b = Integer.parseInt(st.nextToken());

            xCount.put(a, xCount.getOrDefault(a, 0) + 1);
            yCount.put(b, yCount.getOrDefault(b, 0) + 1);
        }

        x = xCount.entrySet().stream()
                .min(Comparator.comparingInt(Map.Entry::getValue))
                .map(Map.Entry::getKey)
                .orElse(0);

        y = yCount.entrySet().stream()
                .min(Comparator.comparingInt(Map.Entry::getValue))
                .map(Map.Entry::getKey)
                .orElse(0);

        System.out.println(x + " " + y);
        br.close();
    }
}
