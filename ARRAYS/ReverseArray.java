import java.util.*;

public class ReverseArray {

    public static void reverseArray(int numbers[]){
        int first = 0, last = numbers.length -1;

        while(first <last){
            //swap
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;

            // increment and decrement of fist and last
            first ++;
            last --;
        }
    }

    public static void printArray(int numbers[]){
        System.out.print("[");
        for(int i=0;i<numbers.length;i++){
            System.out.print(" "+numbers[i]);
        }
        System.out.print("]");
    }


    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10};

        //Array before reversing
        System.out.print("Array before reversing : ");
        printArray(numbers);
        System.out.println();

        // reversing an array
        reverseArray(numbers);

        //Array after reversing
        System.out.print("Array after reversing : ");
        printArray(numbers);
        

    }
    
}
