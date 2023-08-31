
public class BubbleSort{

    public static void bubbleSort(int arr[]){

        for(int turn=0;turn<arr.length;turn++){
            for(int j =0;j<arr.length-1-turn;j++){
                if(arr[j] > arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
            System.out.print(" ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};

        System.out.print("Array before sorting :- ");
        printArray(arr);
        bubbleSort(arr);
        System.out.print("Array after sorting :- ");
        printArray(arr);
    }
}