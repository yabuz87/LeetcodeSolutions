class Solution {
    public int maximumWealth(int[][] accounts) {
        int m=accounts.length;
        int count=0;
        int sum=0;
        for(int i=0;i<m;i++)
        {
            int n=accounts[i].length;
            for(int j=0;j<n;j++)
            {
                sum+=accounts[i][j];
            }
            if(count<sum)
                count=sum;
                sum=0;

        }
        return count;
        
    }
}