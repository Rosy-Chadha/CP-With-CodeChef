import java.io.*;

class trianglewithangle {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        int a = Integer.parseInt(line[0]);
        int b = Integer.parseInt(line[1]);
        int c = Integer.parseInt(line[2]);
        long sum = a + b + c;
        if (((a + b > c) || (a + c > b) || (b + c > a)) && sum == 180 && a > 0 && b > 0 && c > 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
