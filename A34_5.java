//////////////////////////////////////////////////////////////////////////////////////////
//
//  Prasad R. Bhosale
//  Thursday (21/10/2021) (34_5)
//
//  Write java program which accept N numbers from user and return
//  product of all odd elements
//  
//////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Number extends Logic
{
    public Number(int iValue)
    {
        super(iValue);
    }
    public int  Product()
    {
        int iCnt=0,iSum=0;
        for(iCnt=0; iCnt<Arr.length; iCnt++)
        {
           if((Arr[iCnt])%2==1)
           {  
            iSum=1;
            iSum = iSum * Arr[iCnt];
           }   
        }          
        return iSum;
    }
}

class Logic 
{
    public int Arr[];

    public Logic (int iSize)
    {
        Arr = new int [iSize];
    }
    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);
        int iCnt=0;
        System.out.println("Enter elements :");

        for(iCnt=0; iCnt<Arr.length; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }
    }

    public void Display()
    {
        int iCnt=0;

        System.out.println("Elements are :");

        for(iCnt=0; iCnt<Arr.length; iCnt++)
        {
            System.out.println(Arr[iCnt]);
        }
    }
}

class A34_5
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner (System.in);
        int iLength =0;
        int iRet =0;

        System.out.println("Enter Number of elements :");
        iLength = sobj.nextInt();

        Number aobj = new Number(iLength);
        aobj.Accept();
        aobj.Display();
        iRet = aobj.Product();

        System.out.println("Sum of Odd numbers = "+iRet);
        
    }
}