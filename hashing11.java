import java.util.HashSet;
import java.util.LinkedHashSet;

public class hashing11 {
    public static void main(String[] args) {
        HashSet<String > cities = new HashSet<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Noida");
        cities.add("Bangalore");


        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("Delhi");
        lhs.add("Mumbai");
        lhs.add("Noida");
        lhs.add("Bangalore");

       // lhs.remove("Delhi");

       if ( lhs.contains("Delhi")){
           System.out.println("it contains");
       }

        System.out.println(cities);
        System.out.println(lhs);
    }
}

/*

[Delhi, Noida, Mumbai, Bangalore]
[Delhi, Mumbai, Noida, Bangalore]


 */
