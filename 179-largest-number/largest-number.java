class Solution {
    public String largestNumber(int[] nums) {
         String[] mystr=new String[nums.length];
         for(int i=0;i<nums.length;i++)
         {
                mystr[i]=String.valueOf(nums[i]);
         }
         Arrays.sort(mystr, (a,b)->(b+a).compareTo(a+b));
         if(mystr[0].equals("0"))
         return "0";
         
     StringBuilder result=new StringBuilder();
         for(String myStr:mystr)
         {
            result.append(myStr);
         }
         return result.toString();
    }
};
