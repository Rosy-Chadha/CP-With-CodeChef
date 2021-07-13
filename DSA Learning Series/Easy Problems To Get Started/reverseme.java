import java.io.*;

class reverseme {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");
        for (int j = N - 1; j >= 0; j--) {
            System.out.print((Integer.parseInt(str[j])) + (" "));
        }
    }

}
