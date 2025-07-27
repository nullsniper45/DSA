public class MissingNumber_Array {
    public static void main(String[] args) {
        int  arr[] = {1,2,4,5};
        int N = arr.length;
        int xor1 = 0, xor2 = 0;

        for (int i = 0; i < N - 1; i++) {
            xor2 = xor2 ^ arr[i]; // XOR of array elements
            xor1 = xor1 ^ (i + 1); //XOR up to [1...N-1]
        }
        xor1 = xor1 ^ N; //XOR up to [1...N]

        System.out.println(xor1 ^ xor2);
    }
}
