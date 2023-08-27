public class MaxSubArraySumPrefixMethod {
    
    public static void maxSubArraySum(int numbers[]) {

        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefixArr[] = new int[numbers.length];


        prefixArr[0]=numbers[0];
        //Claculate prefix array
        for(int i=1;i<numbers.length;i++){
            prefixArr[i]=prefixArr[i-1]+numbers[i];
        }


        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                currSum = 0;
                for (int k = i; k <= j; k++) {
                    currSum = i == 0 ? prefixArr[j]:prefixArr[j]-prefixArr[i-1];
                
                    if (maxSum < currSum) {
                        maxSum = currSum;
                    }
                }
            }

        }
        System.out.println("Max sum = " + maxSum);

    }

    public static void main(String[] args) {
        int numbers[] = { 2, -3, 1, 4 };

        maxSubArraySum(numbers);
    }
}
