import java.io.*;

class idandship {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            String id = br.readLine();
            if (id.equals("b") || id.equals("B"))
                System.out.println("BattleShip");
            else if (id.equals("c") || id.equals("C"))
                System.out.println("Cruiser");
            else if (id.equals("d") || id.equals("D"))
                System.out.println("Destroyer");
            else // (id == 'f' || id == 'F')
                System.out.println("Frigate");
        }
    }
}