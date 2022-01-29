//////////////////////////////////////////////////////////////////////////////////////////
//
//  Prasad R. Bhosale
//  Thursday (21/10/2021) (32_5)
//
//  Write Java program which accept N numbers from user and display
//  all such elements which are multiples of 11.
//  
//////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;


class ArrayDemo extends Logic
{
    public ArrayDemo(int iValue)
    {
        super(iValue);
    }
    public void Display11()
    {
        int iEvenSum =0,iCnt=0,iOddSum=0;

        for(iCnt=0; iCnt<Arr.length; iCnt++)
        {
            if(Arr[iCnt]%11==0)
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

class A32_5
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner (System.in);
        int iLength =0;

        System.out.println("Enter Number of elements :");
        iLength = sobj.nextInt();

        ArrayDemo aobj = new ArrayDemo(iLength);
        aobj.Accept();
        aobj.Display();
        aobj.Display11();

    }
}