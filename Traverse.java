package assignmentt7;

import java.util.*;

public class Traverse {

    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Ha Noi");
        cities.add("Da Nang");
        cities.add("Ho Chi Minh");
        cities.add("Quang Binh");
        cities.add("Quang Tri");
        System.out.println("Danh sach cac thanh pho: ");
        for (String city : cities) {
            System.out.println(city);
        }
    }

}
