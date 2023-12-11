public class MaxElementArray {

    public static void main(String[] args) {
        int[] arr = {5,2,9,1,5,6};
        int max = findMaxElement(arr);
        System.out.println("The maximum element is: " +max);
    }

    static int findMaxElement(int[] arr){
        if (arr.length == 0) {
            throw new illegalArgumentException("Array is empty ");

            
        }
        int max = arr[0]; 

        
    }
}