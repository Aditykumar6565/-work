import java.util.Scanner;

public class automorphic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :-  ");
        int x = sc.nextInt();
        int y = x*x;
        if (y%10 == x%10) {
            System.out.println("The number " +x+" is Automorphic");
            
        }else
        System.out.println("The number " +x+" is  not Automorphic");

    }
}
