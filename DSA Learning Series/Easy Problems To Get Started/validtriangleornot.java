import java.io.*;

class validtriangleornot {
    public static float area(float a, float b, float c) {
        if (a < 0 || b < 0 || c < 0 || (a + b <= c) || (a + c <= b) || (b + c <= a)) {
            return 0;
        }
        float s = (a + b + c) / 2;
        float A = (float) Math.sqrt(s * (s - a) * (s - b) * (s - c));
        return A;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        int a = Integer.parseInt(line[0]);
        int b = Integer.parseInt(line[1]);
        int c = Integer.parseInt(line[2]);
        float res = area(a, b, c);
        if (res > 0)
            System.out.println("YES");
        else
            System.out.println("NO");
    }

}
