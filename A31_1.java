//////////////////////////////////////////////////////////////////////////////////////////
//
//  Prasad R. Bhosale
//  Sunday (16/10/2021) (31_1)
//
//  Write a java program which accept string from user and count number of capital characters.
//  
//////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Marvellous extends StringX
{
    public int CountCapital()
    {
        int iCnt=0, i=0;
        char Arr[] = str.toCharArray();

        for(i=0; i<Arr.length; i++)
        {
            if((Arr[i]>='A') && (Arr[i]<='Z'))
            {
                iCnt++;
            }
            
        }
        return iCnt;
    }

}


class StringX
{
    public String str;
    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter String : ");
        str = sobj.nextLine();

    }

    public void Display()
    {
        System.out.println("String is : "+str);
    }

}


class A31_1
{
    public static void main(String arg[])
    {
       Marvellous mobj = new Marvellous();
       int iRet =0;
       mobj.Accept();
       mobj.Display();
        
       iRet = mobj.CountCapital();
       System.out.println("Number of Capital letters are :"+iRet);
    }
}