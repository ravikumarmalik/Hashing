import java.util.HashMap;

public class hashmap1 {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();

        //insertion o(1)
        hm.put("india",150);
        hm.put("china",100);
        hm.put("america", 75);
        System.out.println(hm);

        //size
        System.out.println(hm.size());


        //get()- o(1)
        System.out.println(hm.get("india"));

        System.out.println(hm.get("indonesia"));//if value not exist then return null

        //containsKey o(1)
        System.out.println(hm.containsKey("india"));//exist
        System.out.println(hm.containsKey("indonesia"));//if not exist value in table then return nothing.

        //remove()  o(1)
        System.out.println(hm.remove("india"));
        System.out.println(hm);


        //isEmpty - this is to check weather empty or not
        System.out.println(hm.isEmpty());

        //clear - this method clear to all value from table.
        hm.clear();
        System.out.println(hm.isEmpty());

        //after clear size()
        System.out.println("after clear size:"+hm.size());


    }
}

/*

{{china=100, india=150, america=75}
3
150
null
true
false
150
{china=100, america=75}
false
true
after clear size:0



 */
