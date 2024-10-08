class Solution {
    public int numberOfSteps(int num) {
    //     if(num==0)
    //     return 0;
    //     int counter=0;
    //     while(num!=1)
    //     {
    //         if(num%2==0)
    //         {
    //             counter++;
    //             num=num/2;

    //         }
    //         else
    //         {
    //             num=num-1;
    //             counter++;
    //         }
    //     }
    //     num=num-1;
    //     counter++;
    //     return counter;

        
    // }
    // here also an insane approach with the concept of bitwise operation mainly
    // the bitwise and operator and bitmask operation
    int steps=0;
    while(num>0)
    {
        if((num & 1)==0)
        // before we used num%2==0;
        {
            num>>=1;
            // before we used num/=2;
        }
        else
        {
            num--;

        }
        steps++;
    }
    
    return steps;


}
}