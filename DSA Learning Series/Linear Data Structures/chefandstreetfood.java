import java.io.*;

class chefandstreetfood {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            int max = 0;
            for (int j = 0; j < N; j++) {
                String[] str = br.readLine().split(" ");
                int S = Integer.parseInt(str[0]);
                int P = Integer.parseInt(str[1]);
                int V = Integer.parseInt(str[2]);
                int profit = (P / (S + 1)) * V;
                if (max < profit)
                    max = profit;
            }
            System.out.println((max));
        }
    }
}