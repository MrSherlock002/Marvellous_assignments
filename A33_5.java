//////////////////////////////////////////////////////////////////////////////////////////
//
//  Prasad R. Bhosale
//  Thursday (21/10/2021) (33_5)
//
//  Write a program which accept number from user and return
//  difference between summation of even digits and summation of odd digits.
//  
//////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;


class ArrayDemo 
{
    public ArrayDemo(int iValue)
    {
        
    }
    public int CountDiff(int iNo)
    {
        int i=0,iCnt=0,iEvenSum=0,iOddSum=0;

        while(iNo>0)
        {
            i=iNo%10;
            if(i%2==0)
            {
                iEvenSum = iEvenSum + i;
            }
            else
            {
                iOddSum = iOddSum+i;
            }

            iNo = iNo/10;
        } 
        return(iEvenSum-iOddSum);         
    }
}



class A33_5
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner (System.in);
        int iValue =0,iRet=0;

        System.out.println("Enter Number :");
        iValue = sobj.nextInt();

        if(iValue<0)
        {
            iValue = -iValue;
        }

        ArrayDemo aobj = new ArrayDemo(iValue);
        
        iRet = aobj.CountDiff(iValue);
        System.out.println(" Output = "+iRet);
    }
}