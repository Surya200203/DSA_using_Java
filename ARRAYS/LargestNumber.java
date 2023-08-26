import java.util.*;

public class LargestNumber {
    
    public static int largesNumber(int number[]){
        int largest =Integer.MIN_VALUE;  // -infinity
        for(int i=0;i<number.length;i++){
            if(number[i] > largest){
                largest = number[i];
            }
        }

        return largest;
    }

    public static void main(String[] args) {
        int number[] = {2,4,5,6,1};

        //calling function

        int res = largesNumber(number);
        System.out.println("largest number in array is : "+res);

        

    }
}
