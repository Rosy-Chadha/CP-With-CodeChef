import java.io.*;

class grosssalary {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        double HRA = 0, DA = 0, gross = 0;
        for (int i = 0; i < T; i++) {
            int salary = Integer.parseInt(br.readLine());
            if (salary < 1500) {
                HRA = 0.10 * salary;
                DA = 0.90 * salary;
                gross = salary + HRA + DA;
            } else if (salary >= 1500) {
                HRA = 500;
                DA = 0.98 * salary;
                gross = salary + HRA + DA;
            }
            System.out.println(gross);
        }
    }
}