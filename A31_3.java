//////////////////////////////////////////////////////////////////////////////////////////
//
//  Prasad R. Bhosale
//  Thursday (21/10/2021) (31_3)
//
//  Write a java program which accept string from user and return
//  difference between frequency of small characters and frequency
//  of capital characters.
//  
//////////////////////////////////////////////////////////////////////////////////////////
import java.util.*;

class StringDemo extends StringX
{
    public int CountDiff()
    {
        int iCap=0,iSmall=0,i=0;
        char Arr[] = str.toCharArray();

        for(i=0; i<Arr.length; i++)
        {
            if((Arr[i]>='a') && (Arr[i]<='z'))
            {
                iSmall++;
            }
            else if((Arr[i]>='A') && (Arr[i]<='Z'))
            {
                iCap++;   
            }
        }
        return (iSmall - iCap);
    }


}


class StringX
{
public String str;
public void Accept()
{
    Scanner obj = new Scanner(System.in);
    System.out.println("Enter String : ");
    str = obj.nextLine();
}

public void Display()
{
    System.out.println("String is :"+str);
}

}


class A31_3
{
    public static void main(String arg[])
    {
        int iRet= 0;
        StringDemo sobj = new StringDemo();
        sobj.Accept();
        sobj.Display();

        iRet = sobj.CountDiff();
        System.out.println("Difference between the Small letter and Capital letter = "+iRet);
    }

}