import java.util.HashMap;

public class hashmap1 {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();

        //insertion o(1)
        hm.put("india",150);
        hm.put("china",100);
        hm.put("america", 75);

        System.out.println(hm);

        //get()- o(1)
        int population = hm.get("india");
        System.out.println(population);

        System.out.println(hm.get("indonesia"));//if value not exist then return null

        //containsKey o(1)
        System.out.println(hm.containsKey("india"));//exist
        System.out.println(hm.containsKey("indonesia"));//not exist

        //remove()  o(1)
        System.out.println(hm.remove("india"));
        System.out.println(hm);

        //size
        System.out.println(hm.size());

        //isEmpty - this is to check weather empty or not
        System.out.println(hm.isEmpty());

        //clear - this method clear to all value from table.
        hm.clear();
        System.out.println(hm.isEmpty());


    }
}
