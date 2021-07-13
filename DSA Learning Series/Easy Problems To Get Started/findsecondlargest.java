import java.io.*;

class findsecondlargest {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        int sum = A + B + C;
        int ma = Math.max(A, B), mi = Math.min(A, B), max = Math.max(ma, C), min = Math.min(mi, C);
        int sl = sum - (max + min);
        System.out.println(sl);
    }

}
