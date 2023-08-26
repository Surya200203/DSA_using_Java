import java.util.*;
public class PairsInAnArray {

    public static void pairsInArray(int numbers[]){
        for(int i=0;i<numbers.length;i++){
            for(int j=i+1;j<numbers.length;j++){
                System.out.print(" ("+numbers[i]+","+numbers[j]+") ");
            }
        }
    }

    public static void main(String[] args) {

        int numbers[] = {2,4,6,8,10};

        System.out.print("Pairs in an array are : ");
        pairsInArray(numbers);
        
    }
    
}
