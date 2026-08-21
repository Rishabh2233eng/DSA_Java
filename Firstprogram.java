import java.util.*;
public class Firstprogram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Average: ");
        int avg = sc.nextInt();
        if(avg>=90){
            System.out.println("Excellent");
        }
        else if(avg>80 && avg<=90){
            System.out.println("Very Good");
        }
        else if(avg>70 && avg<=80){
            System.out.println("Fair");
        }
        else if(avg>60 && avg<=70){
            System.out.println("Meets as Exceptations");
        }
    }
}
