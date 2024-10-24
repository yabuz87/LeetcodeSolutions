class Solution {
    public int[] replaceElements(int[] arr) {
       int  n=arr.length;
         int  temp;
        for(int i=0;i<n;i++)
        {
            if(i==n-1)
            {
                arr[i]=-1;
                return arr;
            }
         
            temp=arr[i+1];
            for(int j=i+1;j<n;j++)
            {
            
                if(temp<arr[j])
                {
                    temp=arr[j];
                }
            }
            arr[i]=temp;
        
        }
        return arr;
        
    }
}