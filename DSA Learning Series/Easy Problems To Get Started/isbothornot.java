import java.io.*;

class isbothornot {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long N = Long.parseLong(br.readLine());
        if (N % 5 == 0 && N % 11 == 0) {
            System.out.println("BOTH");
        } else if (N % 11 == 0 || N % 5 == 0) {
            System.out.println("ONE");
        } else {
            System.out.println("NONE");
        }
    }
}