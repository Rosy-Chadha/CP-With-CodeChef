import java.io.*;

class rajuandhistrip {
    public static boolean divisibilityby5(String N) {
        int size = N.length();
        return ((Integer.parseInt(N.substring(size - 1)) == 5) || (Integer.parseInt(N.substring(size - 1)) == 0));
    }

    public static boolean divisibilityby6(String N) {
        int size = N.length();
        if ((N.charAt(size - 1) - '0') % 2 != 0)
            return false;
        int digitsum = 0;
        for (int i = 0; i < size; i++) {
            digitsum += N.charAt(i) - '0';
        }
        return (digitsum % 3 == 0);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine();
        if (divisibilityby5(N) || divisibilityby6(N)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

}
