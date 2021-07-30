import java.io.*;

class laddu {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            String[] str = br.readLine().split(" ");
            int activities = Integer.parseInt(str[0]);
            String origin = str[1];
            int laddu = 0;
            for (int j = 0; j < activities; j++) {
                String activity = br.readLine();
                if (activity.equals("TOP_CONTRIBUTOR"))
                    laddu += 300;
                else if (activity.equals("CONTEST_HOSTED"))
                    laddu += 50;
                else if (activity.contains("CONTEST_WON")) {
                    String contestWon[] = activity.split(" ");
                    int rank = Integer.parseInt(contestWon[1]);
                    laddu += 300;
                    if (rank < 20)
                        laddu += (20 - rank);
                } else {
                    String bugFound[] = activity.split(" ");
                    int severity = Integer.parseInt(bugFound[1]);
                    laddu += severity;
                }
            }
            int months = 0;
            if (origin.equals("INDIAN"))
                months = laddu / 200;
            else if (origin.equals("NON_INDIAN"))
                months = laddu / 400;
            System.out.println(months);
        }
    }
}
