import java.util.Scanner;

public class positive  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        if(num<0){
            System.out.println("Negative number "+num);
        }else if(num==0){
            System.out.println("Number is Zero" + num);
        }else {
            System.out.println("Number is postive " + num);
        }

    }
}
