import java.util.Scanner;

public class reverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        getReverse(num);
    }

    static void getReverse(int num) {
        if (num == 0)
            return;

        int rem = num % 10;
        System.out.print(rem);

        getReverse(num / 10);
    }
}
