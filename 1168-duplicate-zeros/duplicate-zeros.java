class Solution {
    public void duplicateZeros(int[] arr) {
       
    int n=arr.length;
    int j=0;
    int[] temp=new int[n];
        for(int i=0;i<n;i++)
            temp[i]=arr[i];
        for(int i=0;i<n;i++)
        {
            arr[i]=temp[j++];
            if(arr[i]==0 && i+1<n)
                arr[++i]=0;
        }
        
        
    }
}