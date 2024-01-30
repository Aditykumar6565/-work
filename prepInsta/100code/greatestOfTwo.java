import java.util.Scanner;

public class greatestOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        if (num1>num2) {
            System.out.println("Number one is greater than number two");
            
        }else{
            System.out.println("Number one is not gretaer than number two ");

        }
    }
}
