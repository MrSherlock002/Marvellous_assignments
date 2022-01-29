//////////////////////////////////////////////////////////////////////////////////////////
//
//  Prasad R. Bhosale
//  Friday (22/10/2021) (35_5)
//
//  Accept string from user and check whether the string is
//  palindrome or not without considering its case.
//  
//////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class StringDemo extends StringX
{
public boolean StrPallindrome()
{
    int start=0,end=0,i=0;

    char src[] = str1.toCharArray();
    char temp[] = new char[512];
    temp = src;
    end = src.length-1;
    for(start=0; start<src.length; start++)
    {
        if(src[start]==temp[end] || src[start]==((char)(temp[end]+32)) || src[start]==((char)(temp[end]-32)))
        {
            end--;
            i++;
        }
        else
        {
            return false;
        }
    }
    if(i>=src.length/2)
    {
        return true;
    }
    
    return false;
}
}



class StringX
{
public String str1;
public void Accept()
{
    Scanner sobj = new Scanner(System.in);

    System.out.println("Enter String  :");
    str1 = sobj.nextLine();
}
public void Display()
{
    System.out.println(" String  : "+str1);
}
}


class A35_5
{
    public static void main(String arg[])
    {   
       // Scanner sobj = new Scanner (System.in);
        int iSize=0;
        boolean bRet = false;

        StringDemo strobj = new StringDemo();

        
        strobj.Accept();
        strobj.Display();

        String S = null;
        bRet = strobj.StrPallindrome();

        if(bRet == true)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
        
    }
}