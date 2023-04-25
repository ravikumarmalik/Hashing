import java.util.HashMap;
import java.util.Set;

public class hashmap2 {//iteration on hashmap

    public static void main(String[] args) {
        HashMap<String,Integer> hm=new HashMap<>();

        hm.put("India",150);
        hm.put("china",100);
        hm.put("us", 75);
        hm.put("nepal",50);

        //Iteration
        Set<String> keys=hm.keySet();
        System.out.println(keys);

        for (String k:keys) {
            System.out.println("key="+k +" values="+hm.get(k));
            
        }
    }
}

/*

[china, nepal, us, India]
key=china values=100
key=nepal values=50
key=us values=75
key=India values=150


 */
