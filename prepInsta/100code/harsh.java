public class harsh {
    public static void main(String[] args) {
        int n = 345;
        int result =0;
        while (n!=0) {
            int pick_last = n % 10;
            result = result + pick_last;
            n=n/10;
            
        }

        if (n%result == 0) {
            System.out.println("Harsh Number");
            
        }
        else
        System.out.println("Not harsh number");
    }
}
