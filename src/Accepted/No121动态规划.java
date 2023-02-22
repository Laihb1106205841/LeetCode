package Accepted;

public class No121动态规划 {
    public int maxProfit(int[] prices) {
        if(prices.length==1){return 0;}
        int Min =prices[0];
        int LocalMax =prices[1]-prices[0];
        for(int i=0;i<prices.length;i++){
            if(prices[i]<Min){Min=prices[i];}
            else if(prices[i]-Min>=LocalMax){
                LocalMax =prices[i]-Min;
            }
        }

        if(LocalMax<=0){return 0;}

        return LocalMax;
    }
}
