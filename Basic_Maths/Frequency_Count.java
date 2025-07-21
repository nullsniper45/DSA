import java.util.HashMap;
import java.util.Map;

public class Frequency_Count {
    public static void main(String[] args) {
        int[] arr = {10, 5, 10, 15, 10, 5};
        Map<Integer,Integer> mapp = new HashMap<>();
        for(Integer i:arr) {
            if(mapp.containsKey(i)) {
                mapp.put(i, mapp.get(i)+1);
            }
            else {
                mapp.put(i,1);
            }
        }
        int maxFreq = 0, minFreq = arr.length;
        int maxEle = 0, minEle = 0;
        // Traverse through map and find the elements
        for (Map.Entry<Integer, Integer> entry : mapp.entrySet()) {
            int count = entry.getValue();
            int element = entry.getKey();

            if (count > maxFreq) {
                maxEle = element;
                maxFreq = count;
            }
            if (count < minFreq) {
                minEle = element;
                minFreq = count;
            }
        }

        System.out.println("The highest frequency element is: " + maxEle);
        System.out.println("The lowest frequency element is: " + minEle);
        System.out.println(mapp);
    }
}
