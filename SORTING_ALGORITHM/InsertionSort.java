public class InsertionSort {
    
    public static void insertionSort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int curr =i;
            int prev = i-1;

            //finding out current position to start
            while(prev >=0 && arr[prev]>curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            //insertion
            arr[prev+1]=curr;
        }
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            System.out.print(" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 3, 2 };

        System.out.print("Array before sorting :- ");
        printArray(arr);
        insertionSort(arr);
        System.out.print("Array after sorting :- ");
        printArray(arr);
    }
}
