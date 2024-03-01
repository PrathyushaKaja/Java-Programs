package arrays;

public class MultiDimensionalArray1 {
    public static void main(String[] args) {
        // Define a 2D array of integers
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        // Calculate the sum of elements in the 2D array
        int sum = calculateArraySum(matrix);
        
        // Display the sum
        System.out.println("Sum of elements in the 2D array: " + sum);
    }
    
    // Method to calculate the sum of elements in a 2D array
    public static int calculateArraySum(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        return sum;
    }
}
