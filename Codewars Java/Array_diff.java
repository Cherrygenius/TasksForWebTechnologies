import java.util.*;

public class Kata {
    public static int[] arrayDiff(int[] a, int[] b) {
        if (b.length == 0) {
            return a.clone();
        }
        
        Set<Integer> toRemove = new HashSet<>();
        for (int x : b) {
            toRemove.add(x);
        }
        
        int count = 0;
        for (int x : a) {
            if (!toRemove.contains(x)) {
                count++;
            }
        }
        
        int[] result = new int[count];
        int index = 0;
        for (int x : a) {
            if (!toRemove.contains(x)) {
                result[index++] = x;
            }
        }
        
        return result;
    }
}