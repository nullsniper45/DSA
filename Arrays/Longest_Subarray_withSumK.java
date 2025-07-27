import java.util.HashMap;
import java.util.Map;

public class Longest_Subarray_withSumK {
    public static void main(String[] args) {

        int n = 6;
        int k = 9;
        int arr[] =  {1,2,3,4,1,-1};
        int j = 0;
        int cnt = 0;
        int maxlength = 0;
        for(int i = 0;i<n;i++) {
            cnt += arr[i];

            if (cnt >k) {
                while(cnt>k) {
                    cnt -= arr[j];
                    j++;
                }
            }
            if(cnt==k) {
                maxlength = Math.max(i-j+1, maxlength);
            }

        }

        System.out.println("maxlength: "+ maxlength);

        subarrayWithSumK_Negatives(arr, k);
    }

    public static void subarrayWithSumK_Negatives(int[] arr, int K) {
        Map<Integer, Integer> mapp = new HashMap<>();
        int maxLen = 0;
        int prefixSum =0;
        for(int i=0;i<arr.length;i++) {
            prefixSum += arr[i];

            if(prefixSum==K) {
                maxLen = Math.max(maxLen, i+1);
            }
            // Case 2: If (prefixSum - K) is seen before
            if (mapp.containsKey(prefixSum - K)) {
                int prevIndex = mapp.get(prefixSum - K);
                maxLen = Math.max(maxLen, i - prevIndex);
            }

            // Only store the first occurrence of each prefixSum
            if (!mapp.containsKey(prefixSum)) {
                mapp.put(prefixSum, i);
            }
        }
        System.out.println("The value of maxlength of the subarray is : "+maxLen);

    }

}
