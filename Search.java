package assignmentt7;

import java.util.*;

public class Search {

    public static void main(String[] args) {
        ArrayList<String> keywords = new ArrayList<>();
        keywords.add("Java");
        keywords.add("Python");
        keywords.add("C++");
        keywords.add("JavaScript");
        if (keywords.contains("Python")) {
            System.out.println("Tu khoa 'Python' co trong danh sach.");
        } else {
            System.out.println("Tu khoa 'Python' khong co trong danh sach.");
        }

    }

}
