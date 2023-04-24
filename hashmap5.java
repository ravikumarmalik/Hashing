


import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
public class hashmap5 {
    public static void main(String[] args) {
        TreeMap<String, Integer> tm = new TreeMap<>();
        tm.put("India",100);
        tm.put("China",150);
        tm.put("Us",50);
        System.out.println(tm);


        LinkedHashMap<String, Integer> lm = new LinkedHashMap<>();
        lm.put("India",100);
        lm.put("China",150);
        lm.put("Us",50);
        System.out.println(lm);

        HashMap<String, Integer> hm = new HashMap<>();
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
