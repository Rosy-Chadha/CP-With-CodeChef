import java.io.*;

class alternativesquarepattern {
    public static int straight(int c, int i) {
        for (int j = c; j <= 5 * i; j++) {
            System.out.print(j + " ");
        }
        System.out.println();
        c = c + 4;
        return c;
    }

    public static int reverse(int c, int i) {
        for (int k = 5 * i; k > c; k--) {
            System.out.print(k + " ");
        }
        System.out.println();
        c = c + 5;
        return c;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int c = 0;
        for (int i = 1; i <= N; i++) {
            if (i % 2 != 0) {
                c = straight(c + 1, i);

            } else {
                c = reverse(c, i);
            }
        }
    }
}