import java.util.Scanner;

public class evenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num%2 == 0){
            System.out.println("Number is Even" +num);
        }else if(num == 0 && num ==1){
            System.out.println("Number is neither prime nor odd " + num);
        }
        else{
            System.out.println("Number is prime number" + num);

        }
    }
}
