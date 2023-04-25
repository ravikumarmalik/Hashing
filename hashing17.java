import java.util.HashMap;
import java.util.HashSet;

public class hashing17 {
    public static void main(String[] args) { //o(n)
        int[] arr = {15,-2,2,-8,1,7,10};

        HashMap<Integer, Integer> map = new HashMap<>();

        //(sum and index)
        int sum=0;
        int len=0;

        for (int j=0; j<arr.length; j++){
            sum += arr[j];

            if (map.containsKey(sum)){
                len = Math.max(len, j-map.get(sum));
            }else {
                map.put(sum,j);
            }
        }
        System.out.println("largest subArray with sum as 0 =>"+len);
    }
}

/*

largest subArray with sum as 0 =>5

 */
