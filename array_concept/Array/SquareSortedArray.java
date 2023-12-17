import java.lang.reflect.Array;
import java.util.*;


 public class SquareSortedArray {
    public static void main(String[] args) {
        int arr[] = {5,3,4,2};
        int n = arr.length;
        int[] squareArr = new int[n];
        for(int i=0;i<n;i++){
             squareArr[i] = arr[i] * arr[i];
             System.out.println(Arrays.toString(squareArr));

            
        }
        //sort the squared values 
        Arrays.sort(squareArr);
        //print soretd array 
        for(int square : squareArr){
            System.out.println(square);
        }
        
    }



    
    
}