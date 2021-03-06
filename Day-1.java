

Java Soln:
class Solution {
    public int maxProfit(int[] prices) {
         // Minimum cost 
        int minimumcost = prices[0];
        // Maximum profit
        int maximumprofit = 0;
        
        
        for(int i=0;i<prices.length;i++){
            
            if(prices[i]<minimumcost){
                minimumcost = prices[i];
            }
            
            int temp = prices[i]-minimumcost;
            
            if(temp>maximumprofit){
                maximumprofit=temp;
            }
        }
        
        return maximumprofit;
    }
}
