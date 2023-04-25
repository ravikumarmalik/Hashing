


import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
public class hashmap5 {
    public static void main(String[] args) {
         //        key      value
          TreeMap<String, Integer> tm = new TreeMap<>();//TreeMap print the value in sorted order.
        tm.put("India",100);
        tm.put("China",150);
        tm.put("Us",50);
        System.out.println(tm);


        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();//LinkedHashMap print the value as per insertion order.
        lhm.put("India",100);
        lhm.put("China",150);
        lhm.put("Us",50);
        System.out.println(lhm);

        HashMap<String, Integer> hm = new HashMap<>();//HashMap print the value in random order.
        hm.put("India",100);
        hm.put("China",150);
        hm.put("Us",50);
        System.out.println(hm);

    }
}

/*

{China=150, India=100, Us=50}
{India=100, China=150, Us=50}
{China=150, Us=50, India=100}



 */
