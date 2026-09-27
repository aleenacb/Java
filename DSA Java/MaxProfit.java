package DSA;
public class MaxProfit {
    public static void main(String[] args) {
        int price[] = {7, 1, 5, 3, 6, 4};
        int minPrice = price[0];
        int profit = 0;
        for(int i = 1; i < price.length; i++) {
            if(price[i] < minPrice) {
                minPrice = price[i];
            }
            profit = Math.max(profit, price[i] - minPrice);
        }
        System.out.println(profit);
    }
}