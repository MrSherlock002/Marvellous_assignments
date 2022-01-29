//////////////////////////////////////////////////////////////////////////////////////////
//
//  Prasad R. Bhosale
//  Thursday (21/10/2021) (34_4)
//
//  Write java program which accept N numbers from user and accept
//  Range, Display all elements from that range
//  
//////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Number extends Logic
{
    public Number(int iValue)
    {
        super(iValue);
    }
    public void Display_1(int iStart, int iEnd)
    {
        int iCnt=0,iTemp=0;
        for(iCnt=0; iCnt<Arr.length; iCnt++)
        {
           if((Arr[iCnt]>=iStart) && (Arr[iCnt]<=iEnd))
           {
               System.out.print("\t"+Arr[iCnt]);
           }   
        }          
        

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

class A34_4
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner (System.in);
        int iLength =0,iStart=0,iEnd=0;
        int iRet =0;

        System.out.println("Enter Number of elements :");
        iLength = sobj.nextInt();

        System.out.println("Enter Start :");
        iStart = sobj.nextInt();

        System.out.println("Enter End :");
        iEnd = sobj.nextInt();

        Number aobj = new Number(iLength);
        aobj.Accept();
        aobj.Display();
        aobj.Display_1(iStart,iEnd);
        
    }
}