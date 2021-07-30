import java.io.*;

class coinflip {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            int G = Integer.parseInt(br.readLine());
            for (int j = 0; j < G; j++) {
                String[] str = br.readLine().split(" ");
                int I = Integer.parseInt(str[0]);
                int N = Integer.parseInt(str[1]);
                int Q = Integer.parseInt(str[2]);
                if (N % 2 == 0)
                    System.out.println(N / 2);
                else {
                    if (I == Q)
                        System.out.println(N / 2);
                    else
                        System.out.println((N + 1) / 2);
                }
            }
        }
    }

}
