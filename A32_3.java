//////////////////////////////////////////////////////////////////////////////////////////
//
//  Prasad R. Bhosale
//  Thursday (21/10/2021) (32_3)
//
//  Write Java program which accept N numbers from user and display
//  all such elements which are even and divisible by 5.
//  
//////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;


class ArrayDemo extends Logic
{
    public ArrayDemo(int iValue)
    {
        super(iValue);
    }
    public void Display5_2()
    {
        int iCnt=0;
        for(iCnt=0; iCnt<Arr.length; iCnt++)
        {
            if(Arr[iCnt]%5==0&&Arr[iCnt]%2==0)
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

class A32_3
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
        aobj.Display5_2();

    }
}