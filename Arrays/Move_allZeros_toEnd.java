public class Move_allZeros_toEnd {
    public static void main(String[] args) {
        int[] arr = {1 ,0 ,2 ,3 ,0 ,4 ,0 ,1};
        System.out.println();
        int a = 1;  //since first index of 0 is 1
        for(int i=a+1;i<arr.length;i++) {
            if(arr[i]!=0) {
                arr[a] = arr[i];
                arr[i] = 0;
                a++;
            }
        }
        System.out.println();
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }

    }
}
