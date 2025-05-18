import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class DuplicatesArrays {

    public static void main(String[] args){

        int[] array = {1, 2, 3, 3, 3, 4, 5, 4, 7, 7, 9, 9, 2};

        int[] results = removeDuplicates(array);

        System.out.println("Here's an array without duplicates "+ Arrays.toString(results));

    }

    public static int[] removeDuplicates(int[] arr){
        ArrayList<Integer> s = new ArrayList<>();

        for (int num: arr){
            if (s.contains(num)){
                continue;
            } else {
                s.add(num);
            }
        }

        int[] newArr = new int[s.size()];
        for (int i=0; i<s.size(); i++){
            newArr[i] = s.get(i);
        }

        return newArr;
    }
}
