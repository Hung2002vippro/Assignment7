package assignmentt7;

import java.util.*;

public class Convert {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        Integer[] array = numbers.toArray(new Integer[0]);

        System.out.println("Cac phan tu trong mang: ");
        for (int num : array) {
            System.out.println(num);
        }
    }

}
