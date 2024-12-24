class Solution {
    public int maxScore(String s) {
        int left=0;
        int right=0;
        int count=0;
        int score=0;
        while(count<s.length())
        {
            if(s.charAt(count)!='0')
            {
                right++;
            }
            count++;
        }
        count=0;
        while(count<s.length()-1)
        {
            if(s.charAt(count)=='0')
            {
                left+=1;
               
            }
            else{
                right--;
            }
            count++;
            score=Math.max(score,(right+left));

        }
        return score;

        
        
        
    }
}