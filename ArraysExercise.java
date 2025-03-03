    // Importing necessary Java package for utility functions
    import java.util.Arrays;
    import java.util.Random;
     
    public class ArraysExercise {
        public void arrayShuffleAndOperations() {
            // Declare and initialize an array with 10 integers
            int[] numbers = {12, 43, 56, 78, 34, 23, 89, 90, 65, 31};
     
            // Display the original array
            System.out.println("Original Array: " + Arrays.toString(numbers));
     
            // Shuffle the array
            shuffleArray(numbers);
            System.out.println("Shuffled Array: " + Arrays.toString(numbers));
     
            // Find and display the sum, minimum, and maximum of the array
            int sum = calculateSum(numbers);
            int min = findMin(numbers);
            int max = findMax(numbers);
     
            System.out.println("Sum of the array: " + sum);
            System.out.println("Minimum value in the array: " + min);
            System.out.println("Maximum value in the array: " + max);
     
            // Sort the array and display the sorted array
            Arrays.sort(numbers);
            System.out.println("Sorted Array: " + Arrays.toString(numbers));
        }
     
        // Method to shuffle the array
        public void shuffleArray(int[] array) {
            Random random = new Random();
            for (int i = array.length - 1; i > 0; i--) {
                int index = random.nextInt(i + 1);
                // Swap the elements
                int temp = array[i];
                array[i] = array[index];
                array[index] = temp;
            }
        }
     
        // Method to calculate the sum of the array
        public int calculateSum(int[] array) {
            int sum = 0;
            for (int num : array) {
                sum += num;
            }
            return sum;
        }
     
        // Method to find the minimum value in the array
        public int findMin(int[] array) {
            int min = array[0];
            for (int num : array) {
                if (num < min) {
                    min = num;
                }
            }
            return min;
        }
     
        // Method to find the maximum value in the array
        public int findMax(int[] array) {
            int max = array[0];
            for (int num : array) {
                if (num > max) {
                    max = num;
                }
            }
            return max;
        }
    }