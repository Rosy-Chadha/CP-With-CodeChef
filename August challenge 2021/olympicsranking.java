import java.io.*;

class olympicsranking {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            String[] str = br.readLine().split(" ");
            int sum1 = 0, sum2 = 0;
            sum1 = Integer.parseInt(str[0]) + Integer.parseInt(str[1]) + Integer.parseInt(str[2]);
            sum2 = Integer.parseInt(str[3]) + Integer.parseInt(str[4]) + Integer.parseInt(str[5]);
            if (sum1 > sum2) {
                System.out.println("1");
            } else {
                System.out.println("2");
            }
        }
    }
}