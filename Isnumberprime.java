import java.util.*;
public class Isnumberprime {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scn.nextInt();
            int count = 0;
            for (int j = 2; j * j <= n; j++) {
                if (n % j == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                System.out.println("Number is prime");
            } else {
                System.out.println("Number is not prime");
            }
        }
        scn.close();
    }
}