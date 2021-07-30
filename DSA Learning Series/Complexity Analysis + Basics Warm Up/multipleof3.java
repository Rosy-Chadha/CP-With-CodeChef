import java.io.*;

class multipleof3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            String[] str = br.readLine().split(" ");
            long K = Long.parseLong(str[0]);
            int d0 = Integer.parseInt(str[1]);
            int d1 = Integer.parseInt(str[2]);
            long sum = d0 + d1;
            if (K >= 3) {
                if (sum % 5 != 0) {
                    sum = sum + (sum % 10);
                    for (long j = (K - 3) % 4; j > 0; j--) {
                        sum += sum % 10;
                    }
                    sum += ((K - 3) / 4) * 20;
                } else {
                    System.out.println("NO");
                    continue;
                }
            }
            if (sum % 3 == 0)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
