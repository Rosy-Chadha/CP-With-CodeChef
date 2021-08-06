import java.io.*;

class penaltyshootout {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            String S = br.readLine();
            int goal[] = { 0, 0 };
            int rem[] = { N, N };
            int flag = 0;
            for (int j = 0; j < N * 2; j++) {
                if (j % 2 == 0) {
                    if (S.charAt(j) == '1')
                        goal[0] += 1;
                    rem[0] -= 1;
                } else {
                    if (S.charAt(j) == '1')
                        goal[1] += 1;
                    rem[1] -= 1;
                }
                if (goal[0] > goal[1]) {
                    if (rem[1] < goal[0] - goal[1]) {
                        System.out.println(j + 1);
                        flag = 1;
                        break;
                    }
                } else {
                    if (rem[0] < goal[1] - goal[0]) {
                        System.out.println(j + 1);
                        flag = 1;
                        break;
                    }
                }
            }
            if (flag == 0) {
                System.out.println(N * 2);
            }
        }
    }
}
