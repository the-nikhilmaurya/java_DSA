/* You are given an array prices where prices[i] is the price of a given stock
    on the ith day. You want to maximie your profit by choosing a single 
    day to buy one stock and choosing a different day in the future to sell that stock.
    Return the maximum profit you can achieve from this transaction. If 
    you cannot achieve any profit, return 0.
 */
public class Stocks {
    public static int BuySellStocks(int prices[]){
        int Buyprice = Integer.MAX_VALUE;
        int Maxprofit = 0;

        for(int i=0;i<prices.length;i++){
            if(Buyprice<prices[i]){  //profit will be obtained
                int profit = prices[i] - Buyprice;
                Maxprofit = Math.max(Maxprofit, profit);
            }else{
                Buyprice = prices[i];
            }
        }
        return Maxprofit;
    }

    public static void main(String[] args) {
        int prices [] = {1,3,5,9,6,4};
        System.out.println(BuySellStocks(prices));
    }
    
}
