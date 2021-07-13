import java.io.*;

class addnaturalnumbers {
    public static long sumOfNN(long N) {
        return (N * (N + 1)) / 2;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long N = Long.parseLong(br.readLine());
        System.out.println(sumOfNN(N));
    }
}
