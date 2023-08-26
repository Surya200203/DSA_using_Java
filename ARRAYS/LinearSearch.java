import java.util.*;

public class LinearSearch {

    public static int linearSearch(int numbers[],int key){
        for(int i=0;i<numbers.length;i++){
            if(numbers[i] == key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        //array
        int numbers[] ={2,4,6,8,10,12,14,16};
        
        // taking key as input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter key to search : ");
        int key = sc.nextInt(); 

        //calling function
        int result = linearSearch(numbers, key);

        //printnig result
        if(result != -1){
            System.out.println(key+" Found at index : "+result);
        }else{
            System.out.println("No such "+key+" present in array.");
        }


    }
}
