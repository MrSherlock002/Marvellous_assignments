//////////////////////////////////////////////////////////////////////////////////////////
//
//  Prasad R. Bhosale
//  Thursday (21/10/2021) (33_4)
//
//  Write a program which accept number from user and return
//  multiplication of all digits.
//  
//////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;


class ArrayDemo 
{
    public ArrayDemo(int iValue)
    {
        
    }
    public int Multiply(int iNo)
    {
        int i=0,iCnt=0,iSum=1;

        while(iNo>0)
        {
            i=iNo%10;
            if(i!=0)
            iSum = iSum * i;
            iNo = iNo/10;
        } 
        return iSum;         
    }
}



class A33_4
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
        
        iRet = aobj.Multiply(iValue);
        System.out.println(" Output = "+iRet);
    }
}