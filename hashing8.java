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


       // set.clear();

        System.out.println(set.size());

        System.out.println(set.isEmpty());

        System.out.println(set.remove(3));
        System.out.println(set);


        if (set.contains(2)){
            System.out.println("set contains 2");

        }if (set.contains(5)){
            System.out.println("set contains 5");
            //if value not present in table then will return nothing.
        }
    }
}

/*

[1, 2, 3, 4]
4
false
true
[1, 2, 4]
set contains 2



 */
