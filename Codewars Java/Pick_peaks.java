import java.util.*;

public class PickPeaks {

    public static Map<String,List<Integer>> getPeaks(int[] array) {
           Map<String, List<Integer>> map = new HashMap<>();
            int pos = 0;
            List<Integer> listPos = new ArrayList<>();
            List<Integer> listPeaks = new ArrayList<>();
           if (array != null) {
               map.put("pos", listPos);
               map.put("peaks", listPeaks);
           }
            for (int i = 0; i < array.length; i++) {
                if (i != 0 && i != array.length - 1 && array[i] > array[i-1] && array[i] == array[i+1]) {
                    pos = i;
                }
                if (array[i] > array[pos]) {
                    pos = 0;
                }
                if (array[i] < array[pos] && pos != 0 && array[pos] != 0) {
                    listPos.add(pos);
                    listPeaks.add(array[pos]);
                    pos = 0;
                }
                if (i != 0 && i != array.length - 1 && array[i] > array[i-1] && array[i] > array[i+1]) {
                    listPos.add(i);
                    listPeaks.add(array[i]);
                }
                map.put("pos", listPos);
                map.put("peaks", listPeaks);
            }
      return map;
    }
}