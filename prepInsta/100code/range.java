public class range {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        int sum = getSum(0,a,b);
        System.out.println("The sum is " + sum);

       }
       static int getSum(int sum,int i,int b){
        if(i>b)
        return sum;
        return i+getSum(sum, i+1, b);
       }

    
}
