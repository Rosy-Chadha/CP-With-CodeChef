import java.io.*;

class triangleeverywhere {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        int a = Integer.parseInt(line[0]);
        int b = Integer.parseInt(line[1]);
        int c = Integer.parseInt(line[2]);
        if (a > 0 && b > 0 && c > 0 && (a + b > c) && (a + c > b) && (b + c > a)) {
            if (a == b && a == c) {
                System.out.println("1");
            } else if ((a == b || b == c || c == a)) {
                System.out.println("2");
            } else {
                System.out.println("3");
            }
        } else {
            System.out.println("-1");
        }
    }

}
