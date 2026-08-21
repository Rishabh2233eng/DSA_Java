import java.util.*;
public class Secondprogram {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = Integer.parseInt(scn.nextLine());
        String name = scn.nextLine();
        System.out.println("Hello " + name + ", here is your acc balance in Cr: " + n);
        for (int i = 0; i < n; i++) {
            System.out.println("Iteration " + (i + 1));
        }
        scn.close();
    }
}