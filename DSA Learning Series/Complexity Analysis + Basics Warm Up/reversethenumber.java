import java.io.*;

class reversethenumber {
    public static int reverse(int N) {
        int rev = 0;
        int rem;
        while (N > 0) {
            rem = N % 10;
            rev = (rev * 10) + rem;
            N = N / 10;
        }
        return rev;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            System.out.println(reverse(N));
        }
    }
}