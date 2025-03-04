public class NumberFinder {
    public static int findGreatestNumber(int[] numbers) {
        // Initialize variables to track the greatest number and its index
        int max = -1;
        int maxIndex = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
                maxIndex = i;
            }
        }

        // If all numbers are negative, return -1 as the greatest number
        if (max == -1) {
            return -1;
        }

        // Return the highest index for clarity
        return maxIndex;
    }

    public static void main(String[] args) {
        // Example usage
        int[] testNumbers = {-5, 3, 0, -2};
        int greatestNumber = findGreatestNumber(testNumbers);
        System.out.println("Greatest number is: " + greatestNumber); 

        // If all numbers are negative
        int[] negativeNumbers = {-1, -2, -3};
        int result = findGreatestNumber(negativeNumbers);
        System.out.println("Result is: " + result);

        // Check if the maximum and its index are correct
        int[] checkNumbers = {4, 5, 6, 7};
        int maxExpected = 7;
        int maxIndexExpected = 3;
        int actualMax = findGreatestNumber(checkNumbers);
        int actualMaxIndex = findGreatestNumber(checkNumbers);

        // Output the results
        System.out.println("Actual Max: " + actualMax);
        System.out.println("Actual Max Index: " + actualMaxIndex);
        System.out.println("Expected Max and Index: " + maxExpected + ", " + maxIndexExpected);
    }
}
