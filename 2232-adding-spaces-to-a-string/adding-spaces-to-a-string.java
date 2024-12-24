class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder newS=new StringBuilder(s);
        char spa=' ';
        for(int i=0;i<spaces.length;i++)
        {
                newS.insert(spaces[i]+i,spa);

        }
         String result=newS.toString();
        return result;
        
    }
}