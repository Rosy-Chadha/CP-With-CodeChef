import java.io.*;

class sumiseverywhere {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long sumodd = 0, sumeven = 0;
        for (int i = 1; i <= 2 * N; i++) {
            if (i % 2 != 0) {
                sumodd = sumodd + i;
            } else {
                sumeven = sumeven + i;
            }
        }
        System.out.println(sumodd + " " + sumeven);
    }
}
