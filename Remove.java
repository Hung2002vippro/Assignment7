package assignmentt7;

import java.util.*;

public class Remove {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }
        numbers.remove(4);
        System.out.println("Danh sach sau khi xoa: ");
        System.out.println(Arrays.toString(numbers.toArray()));
        
    }
}
