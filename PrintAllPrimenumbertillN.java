import java.util.*;
public class PrintAllPrimenumbertillN {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int low = scn.nextInt();
        int high = scn.nextInt();
        for (int i = low; i <= high; i++) {
            int count = 0;
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    count++;
                    break;
                }
            }
            if (i >= 2 && count == 0) {
                System.out.println(i);
            }
        }
        scn.close();
    }
}
