class Solution {
public:
    int romanToInt(string s) {
        int temp=0,newtemp=0,sum=0;
        for(int i=0;i<s.length();i++)
        {
            switch(s[i])
            {
                case 'I': newtemp=1;
                break;
                case 'V': newtemp=5;
                break;
                case 'X': newtemp=10;
                break;
                case 'L': newtemp=50;
                break;
                case 'C': newtemp=100;
                break;
                case 'D': newtemp=500;
                break;
                case 'M': newtemp=1000;
                break;
                default: temp=0;
                break;
            }
            if (temp==0)
            {
                sum+=newtemp;
                    temp=newtemp;
            }
            else if(newtemp<=temp)

            {
                    sum+=newtemp;
                    temp=newtemp;
            }
            else if(newtemp>temp)
            {
                sum-=temp;
                temp=newtemp-temp;
                sum+=temp;
                temp=0;

            }
            

              }
              return sum;
        
    }
};