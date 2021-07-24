import java.io.*;

class carvans {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine());
            String[] arr = br.readLine().split(" ");
            int maxspeed = Integer.parseInt(arr[0]);
            int cars = 1;
            for (int i = 0; i < N; i++) {
                int num = Integer.parseInt(arr[i]);
                if (maxspeed > num) {
                    maxspeed = num;
                    cars = cars + 1;
                }
            }
            System.out.println(cars);
        }
    }

}
