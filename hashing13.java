import java.util.HashSet;

public class hashing13 {
    public static void main(String[] args) { //unique digit
        int num[] = {4,3,2,5,6,7,3,4,2,1};
        HashSet<Integer> set = new HashSet<>();

        for (int i=0; i<num.length; i++){
            set.add(num[i]);
        }
        System.out.println("sets count only unique number :"+set.size());
    }
}

/*

sets count only unique number :7


 */
