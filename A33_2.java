//////////////////////////////////////////////////////////////////////////////////////////
//
//  Prasad R. Bhosale
//  Thursday (21/10/2021) (33_2)
//
//  Write a java program which accept number from user and return the
//  count of Odd digits
//  
//////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;


class ArrayDemo extends Logic
{
    public ArrayDemo(int iValue)
    {
        super(iValue);
    }
    public int CountOdd(int iNo)
    {
        int i=0,iCnt=0,iOddCounter=0;

        while(iNo>0)
        {
            i=iNo%10;
            
            if((i%2)==1)
            {
                iOddCounter++;
            } 
            iNo = iNo/10;
        } 
        return iOddCounter;         
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

class A33_2
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
        //aobj.Accept();
        //aobj.Display();
        iRet = aobj.CountOdd(iValue);
        System.out.println("Count of Odd digits = "+iRet);
    }
}