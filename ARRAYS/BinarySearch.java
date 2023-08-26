import java.util.*;

public class BinarySearch {

    public static int binarySearch(int numbers[],int key){
        int start =0;
        int end = numbers.length -1;

        while(start <= end){
            int mid = (start +end)/2;

            //comparisons
            if(numbers[mid] == key){ //found condition
                return mid;
            }
            if(numbers[mid] < key){ //right
                start = mid+1; 
            }else{  //left
                end = mid-1;
            }
        }

        return -1; // not found condition
    }

    public static void main(String[] args) {

        //array
        int number[] ={2,4,6,8,10,12};

        //key 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter key to search in array : ");
        int key = sc.nextInt();

        //calling function
        int res = binarySearch(number,key);
        if(res == -1){
            System.out.println(key+" Not found ");
        }else{
            System.out.println(key +" Found at index : "+res);
        }
    }
    
}
