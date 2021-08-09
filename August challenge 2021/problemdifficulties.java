import java.io.*;
import java.util.*;

class problemdifficulties {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            Set<Integer> set = new HashSet<Integer>();
            String[] str = br.readLine().split(" ");
            int[] a = new int[4];
            for (int j = 0; j < 4; j++) {
                a[j] = Integer.parseInt(str[j]);
                set.add(a[j]);
            }
            int l = set.size();
            if (l == 4 || l == 3)
                System.out.println(2);
            else if (l == 2) {
                Arrays.sort(a);
                if (a[0] == a[1] && a[2] == a[3])
                    System.out.println(2);
                else
                    System.out.println(1);
            } else
                System.out.println(0);
        }
    }
}
