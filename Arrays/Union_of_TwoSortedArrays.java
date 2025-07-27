import java.util.ArrayList;

public class Union_of_TwoSortedArrays {
    public static void main(String[] args) {
        ArrayList<Integer> union = new ArrayList<>();
        int n = 9, m = 7;
        int arr1[] = {1, 2, 3, 4, 5, 6, 8, 9, 10};
        int arr2[] = {2, 3, 4, 4, 5, 11, 12};
        int i = 0;
        int j =0;
        while(i<n && j<m) {
            if(arr1[i]<arr2[j]) {
                if(union.isEmpty()) {
                    union.add(arr1[i]);
                }
                else if(union.get(union.size() - 1)!=arr1[i]) {
                    union.add(arr1[i]);
                }
                i++;
            }
            else {
                if(union.isEmpty()) {
                    union.add(arr2[j]);
                }
                else if(union.get(union.size() - 1)!=arr2[j]) {
                    union.add(arr2[j]);
                }
                j++;
            }
        }
        while(i<n) {
            union.add(arr1[i]);
            i++;
        }
        while(j<m) {
            union.add(arr2[j]);
            j++;
        }
        System.out.println();
        for(int k=0;k<union.size();k++) {
            System.out.print(union.get(k)+" ");
        }
    }


}
