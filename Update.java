package assignmentt7;

import java.util.*;

public class Update {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            numbers.add(i);
        }
        numbers.set(2, 100);
        for (int number : numbers) {
            System.out.println(number);
        }

    }

}
