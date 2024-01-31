import java.util.Scanner;

public class reverseStringbuffer {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string name:-  ");
        String name = sc.nextLine();
        StringBuffer sb = new StringBuffer(name);
        System.out.println("The reversed string is "+ sb.reverse());
    }
}