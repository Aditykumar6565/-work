import java.util.Scanner;

public class leap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num%400==0){
            System.out.println("Year is leap year " +num);
        }else if(num%4 ==0 && num %100 != 0){
        System.out.println(num+ " is a leap year");
        }
        else{
            System.out.println("Year is not leap year " +num);
        }
    }
}
