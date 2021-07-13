import java.io.*;

class factorsfinding {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 0;
        for (int i = 1; i <= N; ++i) {
            if (N % i == 0) {
                count = count + 1;
            }
        }
        System.out.println(count);
        for (int j = 1; j <= N; j++) {
            if (N % j == 0) {
                System.out.print(j + (" "));
            }
        }
    }
}
