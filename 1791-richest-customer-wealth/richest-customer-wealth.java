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
        // the above was my first answer before i watched a guiding video but then i found a fancy was writing a code than me in java by using forEach loop

//         int before=0;
//         for(int[] customer:accounts)
//         {
//             int currentCustomerWealth=0;
//             for(int bank:customer)
//             {
//                 currentCustomerWealth+=bank;
//             }
//             before=Math.max(currentCustomerWealth,before);

//             }
//              return before;
//         }
// }
       

        }
        return count;
        
    }
}