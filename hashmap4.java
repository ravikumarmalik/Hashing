import java.util.*;
public class hashmap4 {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        lhm.put("india",100);
        lhm.put("china",150);
        lhm.put("us",50);

        //LinkedHashMap print the value as per insertion order.
        System.out.println(lhm);
    }
}

/*

{india=100, china=150, us=50}

 */
