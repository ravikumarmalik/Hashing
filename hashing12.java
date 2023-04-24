import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class hashing12 {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();//normal order
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Noida");
        cities.add("Bangalore");

        LinkedHashSet<String> lhs = new LinkedHashSet<>();//insertion order
        lhs.add("Delhi");
        lhs.add("Mumbai");
        lhs.add("Noida");
        lhs.add("Bangalore");

        TreeSet<String> tr = new TreeSet<>();//ascending order
        tr.add("Delhi");
        tr.add("Mumbai");
        tr.add("Noida");
        tr.add("Bangalore");

        System.out.println(cities);
        System.out.println(lhs);
        System.out.println(tr);
    }
}

/*

[Delhi, Noida, Mumbai, Bangalore]
[Delhi, Mumbai, Noida, Bangalore]
[Bangalore, Delhi, Mumbai, Noida]

 */
