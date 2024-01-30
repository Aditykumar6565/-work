import java.util.*;

public class sumOfdigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Sum of digits : " + getSum(num));

    }

    static int getSum(int num) {
        if (num == 0)
            return 0;
        return (num % 10) + getSum(num / 10);
    }
}