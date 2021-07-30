import java.io.*;

class factorial {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            int sumzero = 0;
            while (N >= 5) {
                double division = N / 5;
                sumzero = sumzero + (int) division;
                N = N / 5;
            }
            System.out.println(sumzero);
        }
    }
}
