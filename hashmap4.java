import java.util.*;
public class hashmap4 {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> lhm= new LinkedHashMap<>();
        lhm.put("india",100);
        lhm.put("china",150);
        lhm.put("us",50);

        System.out.println(lhm);
    }
}
