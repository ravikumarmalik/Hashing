import java.util.HashSet;

public class hashing8 {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(2);
        set.add(1);

        System.out.println(set);

        //set.remove(2);
       // set.clear();

        System.out.println(set.size());

        System.out.println(set.isEmpty());


        if (set.contains(2)){
            System.out.println("set contains 2");
        }if (set.contains(5)){
            System.out.println("set contains 5");
        }
    }
}
