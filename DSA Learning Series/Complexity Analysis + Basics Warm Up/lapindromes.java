import java.io.*;

class lapindromes {
    public static boolean checklapin(String S) {
        int maxchar = 26;
        int[] count = new int[maxchar];
        int n = S.length();
        if (n == 1)
            return true;
        for (int i = 0, j = n - 1; i < j; i++, j--) {
            count[S.charAt(i) - 'a']++;
            count[S.charAt(j) - 'a']--;
        }
        for (int i = 0; i < maxchar; i++) {
            if (count[i] != 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            String S = br.readLine();
            if (checklapin(S.toLowerCase()))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }

}
