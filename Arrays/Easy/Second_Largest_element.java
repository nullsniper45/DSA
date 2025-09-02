public class Second_Largest_element {
    public static void main(String[] args) {
        int arr[] =  {2,5,1,3,0};

        int largest = arr[0];
        int res = arr[0];

        for (int i=0;i<arr.length;i++) {
            if(arr[i]>largest) {
                res = largest;
                largest = arr[i];
            }
            else if (arr[i]<largest && arr[i]>res) {
                res = arr[i];
            }

        }

        System.out.println(res);
    }
}
