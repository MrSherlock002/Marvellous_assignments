//////////////////////////////////////////////////////////////////////////////////////////
//
//  Prasad R. Bhosale
//  Thursday (21/10/2021) (33_3)
//
//  Write a program which accept number from user and return the
//  count of digits in between 3 and 7.
//  
//////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;


class ArrayDemo extends Logic
{
    public ArrayDemo(int iValue)
    {
        super(iValue);
    }
    public int CountRange(int iNo)
    {
        int i=0,iCnt=0,iCounter=0;

        while(iNo>0)
        {
            i=iNo%10;
            
            if((i>3) && (i<7))
            {
                iCounter++;
            } 
            iNo = iNo/10;
        } 
        return iCounter;         
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

class A33_3
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
        iRet = aobj.CountRange(iValue);
        System.out.println(" Output = "+iRet);
    }
}