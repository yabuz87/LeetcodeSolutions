class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int n=piles.length;
        int sum=0;
        int chance=n/3;
        n=n-1;
      if(chance==1){
        return piles[1];
      };

        while(n>0 && chance!=0)
        {
            n=n-1;
            sum+=piles[n];
            n--;
            chance--;

        }
        return sum;
        
    }
}