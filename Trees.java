import java.util.TreeSet;
import java.util.Comparator;

public class Trees {

    public static void main(String[] args){

        //Let us create a comparator to sort it in descending order
        Comparator<Integer> descendingOrder = (a, b) -> b - a;

        TreeSet<Integer> numbers = new TreeSet<>(descendingOrder);

        numbers.add(5);
        numbers.add(8);
        numbers.add(2);
        numbers.add(10);
        numbers.add(1);


        System.out.println("Order of numbers: " + numbers);

        //Let us do view up to 4
        System.out.println("Numbers up and including 5: " + numbers.tailSet(5));

    }

}
