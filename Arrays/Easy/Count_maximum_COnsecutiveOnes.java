public class Count_maximum_COnsecutiveOnes {
    public static void main(String[] args) {
        int[] prices = {0, 1, 1, 1, 1, 1, 0, 1, 1, 1};
        int maxi = 0;
        int cnt = 0;
        for(int i=0;i<prices.length;i++) {
            if(prices[i] == 1) {
                cnt++;
                maxi = Math.max(maxi, cnt);
            }
            else{
                cnt = 0;
            }
        }
        System.out.println(maxi);
    }
}
