
public class Array2dUtility {

    //  Declare all methods as static.

    // 1. print
    // Implement a method called print that prints out the values of a 2D array of integers row by row.
        public static void print(int[][] two_arrays){
            for (int i = 0; i < two_arrays.length; i++){
                for (int j = 0; j < two_arrays[i].length; j++) {
                    System.out.print(two_arrays[i][j] + " ");
                }
                System.out.println();
            }
        }
    // 2. sum
    // Implement a method called sum that returns the sum of a 2D array of integers
        public static int sum(int[][] two_arrays){
            int array_sum = 0;
            for (int i = 0; i < two_arrays.length; i++){
                for (int j = 0; j < two_arrays[i].length; j++){
                    array_sum += two_arrays[i][j];
                }
            }
            return array_sum;
        }

    // 3. average
    // Implement a method called average that returns the average value of a 2D array of integers.
    // You may assume that the 2D array is a square. That is, it has the same number of rows and columns.
    // Reminder: call your sum method within the average method.
        public static double average(int[][] two_arrays){
            int total = sum(two_arrays);
            int totalarrayelements = two_arrays.length * two_arrays[0].length;
            return (double) total / totalarrayelements;
        }

    // 4. minimum
    // Implement a method called minimum that returns the minimum value of a 2D array of integers.
        public static int minimum(int[][] two_arrays) {
            int min = two_arrays[0][0];

            for (int i = 0; i < two_arrays.length; i++) {
                for (int j = 0; j < two_arrays[i].length; j++) {
                    if (two_arrays[i][j] < min) {
                        min = two_arrays[i][j];

                    }

                }


            }
            return min;
        }


    // 5. maximum
    // Implement a method called maximum that returns the maximum value of a 2D array of integers.
        public static int maximum(int[][] two_arrays) {
            int max = two_arrays[0][0];

             for (int i = 0; i < two_arrays.length; i++) {
                 for (int j = 0; j < two_arrays[i].length; j++) {
                     if (two_arrays[i][j] > max) {
                         max = two_arrays[i][j];

                }

            }


        }
             return max;
    }

    // 6. evenCountStandard
    // Implement a method called evenCountStandard that returns the number of even numbers in a 2D array of integers.
    // Use a standard for loop to implement this method.
        public static int evenCountStandard(int[][] two_arrays) {
            int count = 0;

            for (int i = 0; i < two_arrays.length; i++) {
                for (int j = 0; j < two_arrays[i].length; j++) {
                    if (two_arrays[i][j] % 2 == 0) {
                        count++;
                }
            }
        }

            return count;
    }
    // 7. evenCountEnhanced
    // Implement a method called evenCountEnhanced that returns the number of even numbers in a 2D array of integers.
    // Use an enhanced for loop to implement this method.
        public static int evenCountEnhanced(int[][] two_arrays) {
            int count = 0;

            for (int[] row : two_arrays) {
                for (int num : row) {
                    if (num % 2 == 0) {
                        count++;
                }
            }
        }

             return count;
    }

    // 8. allPositive
    // Implement a method called allPositive that returns true if all the values in a 2D array of integers are positive.
        public static boolean allPositive(int[][] two_arrays) {
            for (int i = 0; i < two_arrays.length; i++) {
                for (int j = 0; j < two_arrays[i].length; j++) {
                    if (two_arrays[i][j] <= 0){
                        return false;
                    }
                }
            }

             return true;
        }

    // 9. rowSums
    // Implement a method called rowSums that returns a one dimensional array that contains the sum of each row at each index.
        public static int[] rowSums(int[][] two_arrays) {
            int[] sums = new int[two_arrays.length];

            for (int i = 0; i < two_arrays.length; i++) {
                    int rowSum = 0;
                for (int j = 0; j < two_arrays[i].length; j++) {
                    rowSum += two_arrays[i][j];
                 }
                    sums[i] = rowSum;
             }
            return sums;
     }
    // 10. colSums
    // Implement a method called colSums that returns a one dimensional array that contains the sum of each col at each index.
        public static int[] colSums(int[][] two_arrays) {
            int maxCols = 0;
            for (int i = 0; i < two_arrays.length; i++) {
                if (two_arrays[i].length > maxCols) {
                maxCols = two_arrays[i].length;
                }
            }

            int[] sums = new int[maxCols];

            for (int i = 0; i < two_arrays.length; i++) {
                for (int j = 0; j < two_arrays[i].length; j++) {
                    sums[j] += two_arrays[i][j];
                }
            }

            return sums;
        }
    }
