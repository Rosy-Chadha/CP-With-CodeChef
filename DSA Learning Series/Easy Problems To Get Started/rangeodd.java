import java.io.*;

class rangeodd {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int L = Integer.parseInt(str[0]);
        int R = Integer.parseInt(str[1]);
        for (int i = L; i <= R; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
