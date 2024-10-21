public class CumulativeSum {
    public static void main(String[] args) {
        int[] results = cumulativeSum(4, 5, 10);
        for (int result : results) {
            System.out.println(result);
        }
    }

    public static int[] cumulativeSum(int... numbers) {
        int[] cumulativeSums = new int[numbers.length];
        int totalSum = 0;

        for (int i = 0; i < numbers.length; i++) {
            int sum = 0;
            for (int j = 1; j <= numbers[i]; j++) {
                sum += j;
            }
            totalSum += sum;
            cumulativeSums[i] = totalSum;
        }

        return cumulativeSums;
    }
}