import java.util.Scanner;

public class palindromeNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your number:- ");
    int num = sc.nextInt();
    int reverse = 0,rem,temp;
    temp = num;
    while (temp!=0) {
        rem = temp%10;
        reverse = reverse *10 +rem;
        temp /= 10;

        
    }if (num==reverse) {
        System.out.println("The given number  "+num+"  is palindrome number; ");

        
    }else
    System.out.println("The given number "+num+"  is not palindrome number; ");
  }
}
