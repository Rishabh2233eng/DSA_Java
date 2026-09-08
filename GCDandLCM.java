import java.util.*;
public class GCDandLCM {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int on1 = a;
        int on2 = b;

        while(a%b!=0){
            int rem = a%b;
            a=b;
            b=rem;
        }
        int gcd = b;
        int lcm = (on1*on2)/gcd;
        System.out.println("GCD: " + gcd);
        System.out.println("LCM: " + lcm);
    }
}