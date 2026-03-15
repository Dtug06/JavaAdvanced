package SS6.btth;
import java.util.Random;

public class demo extends Thread {
    String[] names = {"3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18"};
    Random random = new Random();
    public void run() {
        while (true) {
            int index = random.nextInt(names.length);
            System.out.println(names[index]);

            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        demo t = new demo();
        t.start();
    }
}
