//////////////////////////////////////////////////////////////////////////////////////////
//
//  Prasad R. Bhosale
//  Thursday (21/10/2021) (34_2)
//
//  Write java program which accept N numbers from user and accept
//  one another number as NO , return index of first occurrence of that NO.
//  
//////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Number extends Logic
{
    public Number(int iValue)
    {
        super(iValue);
    }
    public int FirstOcc(int iNo)
    {
        int iCnt=0;
        for(iCnt=0; iCnt<Arr.length; iCnt++)
        {
            if(Arr[iCnt]==iNo)
            {
                return(iCnt+1); 
            }  
        }          
        return -1;
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

class A34_2
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner (System.in);
        int iLength =0,iValue=0;
        int iRet =0;

        System.out.println("Enter Number of elements :");
        iLength = sobj.nextInt();

        System.out.println("Enter Value of N :");
        iValue = sobj.nextInt();

        Number aobj = new Number(iLength);
        aobj.Accept();
        aobj.Display();
        iRet = aobj.FirstOcc(iValue);

        System.out.println("Position of N = "+iRet);
        
    }
}