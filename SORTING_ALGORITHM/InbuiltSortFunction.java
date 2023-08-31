import java.util.Arrays;
import java.util.Collections;

public class InbuiltSortFunction {


    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            System.out.print(" ");
        }
        System.out.println();
    }

    public static void printArray2(Integer arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            System.out.print(" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] ={5,4,1,3,2};
        Integer arr2[] ={5,4,1,3,2};

        System.out.print("Array before sorting :- ");
        printArray(arr);
        Arrays.sort(arr); // time complexity  :- O(log(n))
        System.out.print("Array after sorting :- ");
        printArray(arr);

        Arrays.sort(arr2,Collections.reverseOrder());
        System.out.println("Array in reverse order after sorting : -");
        printArray2(arr2);

    }
}
