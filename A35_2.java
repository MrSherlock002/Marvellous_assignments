//////////////////////////////////////////////////////////////////////////////////////////
//
//  Prasad R. Bhosale
//  Friday (22/10/2021) (35_2)
//
//  Write a program which 2 strings from user and check whether
//  contents of two strings are equal or not.
//  
//////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

class StringDemo extends StringX
{
public Boolean StrCmpX()
{
    int i=0;
    char src[] = str1.toCharArray();
    char dest[] = str2.toCharArray();
    char temp[] = new char[512];

    for(i=0; i<src.length; i++)
    {
        if(src[i]==dest[i])
        {
            i++;
        }
        else
        {
            return false;
        }
        
    }
    return true;
}
}



class StringX
{
public String str1,str2;
public void Accept()
{
    Scanner sobj = new Scanner(System.in);

    System.out.println("Enter String 1 :");
    str1 = sobj.nextLine();

    System.out.println("Enter String 2 :");
    str2 = sobj.nextLine();
}
public void Display()
{
    System.out.println(" String 1 ="+str1);
    System.out.println(" String 1 ="+str2);
}
}


class A35_2
{
    public static void main(String arg[])
    {   
       // Scanner sobj = new Scanner (System.in);
        int iSize=0;
        boolean iRet=false;

        StringDemo strobj = new StringDemo();

        
        strobj.Accept();
        strobj.Display();

        iRet = strobj.StrCmpX();
        if (iRet==true)
        {
            System.out.println("Both Strings are Same");
        }
        else
        {
            System.out.println("Both Strings are NOT Same");
        }
    }
}