//////////////////////////////////////////////////////////////////////////////////////////
//
//  Prasad R. Bhosale
//  Thursday (21/10/2021) (33_1)
//
//  Write a java program which accept number from user and return the
//  count of even digits
//  
//////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;


class ArrayDemo extends Logic
{
    public ArrayDemo(int iValue)
    {
        super(iValue);
    }
    public int CountEven(int iNo)
    {
        int i=0,iCnt=0,iEvenCounter=0;

        while(iNo>0)
        {
            i=iNo%10;
            
            if((i%2)==0)
            {
                iEvenCounter++;
            } 
            iNo = iNo/10;
        } 
        return iEvenCounter;         
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

class A33_1
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
        iRet = aobj.CountEven(iValue);
        System.out.println("Count of even digits = "+iRet);
    }
}