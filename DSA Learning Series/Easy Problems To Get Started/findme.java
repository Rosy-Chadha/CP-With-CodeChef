import java.io.*;

class findme {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        int N = Integer.parseInt(line[0]);
        int K = Integer.parseInt(line[1]);
        String[] str = br.readLine().split(" ");
        int flag = -1;
        for (int i = 0; i < N; i++) {
            if (Integer.parseInt(str[i]) == K) {
                flag = 1;
                break;
            } else {
                flag = -1;
            }
        }
        System.out.println((flag != -1) ? 1 : -1);
    }

}
