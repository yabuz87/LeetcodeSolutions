class Solution {
    public boolean checkIfExist(int[] arr) {
        int n=arr.length;
        // int temp1,temp2;
        for(int i=0;i<n;i++)
        {
                
            for(int j=0;j<n;j++)
            {
                if( i!=j && arr[j]==2*arr[i])
                    return true;
                    
            }
        }
        return false;
        
    }
}