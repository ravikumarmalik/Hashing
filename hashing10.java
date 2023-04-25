import java.util.HashSet;
import java.util.Iterator;

public class hashing10 {
    public static void main(String[] args) {
        HashSet<String > cities = new HashSet<>(); //random order
        cities.add("Bihar");
        cities.add("Jharkhand");
        cities.add("delhi");
        cities.add("Mumbai");
        cities.add("Bangalore");

//        Iterator<String> itr=cities.iterator();
//        while (itr.hasNext()){
//            System.out.println(itr.next());
//        }

        for (String city : cities){
            System.out.println(city);
        }

    }
}

/*
it's in unordered.
-----------------
Jharkhand
Bihar
delhi
Mumbai
Bangalore


 */
