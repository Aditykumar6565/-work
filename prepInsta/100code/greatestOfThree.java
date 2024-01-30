import java.util.Scanner;

public class greatestOfThree {
    public static void main(String[] args) {
        int temp, result;
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        temp = num1>num2 ? num1:num2;
        result = temp>num3 ? temp:num3;

        System.out.println(result + "is the greatest");



    }
}
