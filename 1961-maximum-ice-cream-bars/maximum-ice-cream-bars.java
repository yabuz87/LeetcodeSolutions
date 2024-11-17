class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int n=costs.length;
           int sum=0;
        Arrays.sort(costs);
        for(int i=0;i<n;i++)
        {
            if(coins-costs[i]>=0)
            {
                sum++;
                coins=coins-costs[i];
            }
            else{
                break;
            }
        }
        return sum;
       
        
    }
}