public class BinarySearch {

    public static void main(String[] args){

        //Most important, we work with sorted arrays
        //Write the method to perform a Binary Search

        int[] exampleArray = {1, 2, 3, 4, 5, 6, 7, 8, 8, 10,11}; //Must be ordered
        int target = 7;

        //So in a technical interview it would be wise to ask if the array is sorted or
        //Not however it is always wise to sort it regardless anyway

        int result = binarySearch(exampleArray, target);

        if (result == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at index: " + result);
        }

    }

    public static int binarySearch(int[] sortedArr, int target){
        int low = 0;
        int high = sortedArr.length - 1;

        while (low <= high){
            int mid = low + (high - low) / 2;

            if (sortedArr[mid] == target){  //target has been found
                return mid;
            }

            if (sortedArr[mid] < target){  //Search in the right half of the array
                low = mid + 1;
            } else {  //Search in the left half of the array
                high = mid - 1;
            }

        }
        return -1; //target isn't found inside the array
    }
}
