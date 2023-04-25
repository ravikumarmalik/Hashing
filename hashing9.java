import java.util.HashSet;
import java.util.Iterator;

public class hashing9 {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(1);
        hs.add(12);
        hs.add(5);
        hs.add(2);
        hs.add(8);
        hs.add(9);

        Iterator<Integer> itr=hs.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}

/*

1
2
5
8
9
12


 */
