public class MaxSubArraySum {
    public static void maxSubArraySum(int numbers[]) {

        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                currSum = 0;
                for (int k = i; k <= j; k++) {
                    //subarray sum
                    currSum += numbers[k];
                }
                System.out.println(currSum);
                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
            
        }
        System.out.println("Max sum = "+maxSum);

    }

    public static void main(String[] args) {
        int numbers[] = { 2, -3,1,4 };

        maxSubArraySum(numbers);
    }
}
