import java.io.*;
import java.util.*;

class smartphone {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long[] cost = new long[N];
        for (int i = 0; i < N; i++) {
            cost[i] = Long.parseLong(br.readLine());
        }
        Arrays.sort(cost);
        int currcount = N;
        long currrev = cost[0] * currcount;

        for (int i = 1; i < N; i++) {
            long maxrev = 0;
            currcount = currcount - 1;
            if (currcount > 0) {
                maxrev = cost[i] * currcount;
            }
            if (maxrev > currrev) {
                currrev = maxrev;
            }
        }
        System.out.println(currrev);
    }
}
