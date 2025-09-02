public class Linear_Search {
    public static void main(String[] args) {
        int arr[] ={1, 2, 3, 4, 5};
        int num = 3;
        for(int i=0;i<arr.length;i++) {
            if(num == arr[i]) {
                System.out.println("The number "+num+" is at the index : "+i);
                break;
            }
        }
    }
}
