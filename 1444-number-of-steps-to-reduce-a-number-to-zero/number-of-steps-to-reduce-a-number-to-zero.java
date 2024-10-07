class Solution {
    public int numberOfSteps(int num) {
        if(num==0)
        return 0;
        int counter=0;
        while(num!=1)
        {
            if(num%2==0)
            {
                counter++;
                num=num/2;

            }
            else
            {
                num=num-1;
                counter++;
            }
        }
        num=num-1;
        counter++;
        return counter;

        
    }
}