import java.util.*;

//sum of odd and even number in in an array and print array

public class odd_even {
    public static void main(String[] args) {
        int a[]= {34,67,3,575,68};
        int sumEven = 0;
        int sumOdd = 0;

        for(int i =0;i<a.length;i++){
            if(a[i]% 2 ==0){
                System.out.println("Even >>"+a[i]);

                //Yaha pe maine array banae ki kosis ki hai

                //int eve = a[i];
                int even = a[i];
                sumEven = sumEven+a[i];
            }else{
                System.out.println("Odd"+a[i]);
                sumOdd = sumOdd+a[i];
                int odd = a[i];

                //Yaha pe maine array banae ki kosis ki hai


               // int odd = a[i];
            }
            // int o = odd;
            // int b = even;
            // System.out.println(o);
            // System.out.println(b);


            System.out.println("Sum of Even Number is"+sumEven);
            System.out.println("Sum of Even Number is"+sumEven);
            //fir maine socha ki agar array ko print karna hai to aisa karna padega to kiya ab result ki barai
            // for(int j=0;j<eve.length;j++){
            //     System.out.println(eve[j]);
            // }
            // for(int k=0;k<eve.length;k++){
            //     System.out.println(odd[k]);
            // }

        }





    }

    
}
/** got first time error for code :- public class odd_even {
    public static void main(String[] args) {
        int a[]= {34,67,3,575,68};
        int sumEven = 0;
        int sumOdd = 0;

        for(int i =0;i<a.length;i++){
            if(a[i]% 2 ==0){
                System.out.println("Even >>"+a[i]);

                //Yaha pe maine array banae ki kosis ki hai

                int eve[] = a[i];
                sumEven = sumEven+a[i];
            }else{
                System.out.println("Odd"+a[i]);
                sumOdd = sumOdd+a[i];

                //Yaha pe maine array banae ki kosis ki hai


                int odd[] = a[i];
            }

            System.out.println("Sum of Even Number is"+sumEven);
            System.out.println("Sum of Even Number is"+sumEven);
            //fir maine socha ki agar array ko print karna hai to aisa karna padega to kiya ab result ki barai
            for(int j=0;j<eve.length;j++){
                System.out.println(eve[j]);
            }
            for(int k=0;k<eve.length;k++){
                System.out.println(odd[k]);
            }

        }





    }     error are as of follow :- odd_even.java:17: error: incompatible types: int cannot be converted to int[]
                int eve[] = a[i];
                             ^
odd_even.java:26: error: incompatible types: int cannot be converted to int[]
                int odd[] = a[i];
                             ^
odd_even.java:32: error: cannot find symbol
            for(int j=0;j<eve.length;j++){
                          ^
  symbol:   variable eve
  location: class odd_even
odd_even.java:33: error: cannot find symbol
                System.out.println(eve[j]);
                                   ^
  symbol:   variable eve
  location: class odd_even
odd_even.java:35: error: cannot find symbol
            for(int k=0;k<eve.length;k++){
                          ^
  symbol:   variable eve
  location: class odd_even
odd_even.java:36: error: cannot find symbol
                System.out.println(odd[k]);
                                   ^
  symbol:   variable odd
  location: class odd_even
6 errors  */