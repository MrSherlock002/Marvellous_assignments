//////////////////////////////////////////////////////////////////////////////////////////
//
//  Prasad R. Bhosale
//  Friday (22/10/2021) (35_4)
//
//  Accept sing from user and reverse the contents of that string
//  by toggling the case.
//  
//////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

import javax.print.event.PrintEvent;

class StringDemo extends StringX
{
public String StrRevTogX()
{
    int i=0,iCnt=0;

    char src[] = str1.toCharArray();
    char temp[] = new char[512];

    for(i=src.length-1; i>=0; i--)
    {
        if(src[i]>='A' && src[i]<='Z')
        {
            temp[iCnt]=(char) (src[i]+32);
            iCnt++;
        }
        else if(src[i]>='a' && src[i]<='z')
        {
            temp[iCnt]=(char) (src[i]-32);
            iCnt++;
        }

    }
    String S= new String(temp);
    return S;
}
}



class StringX
{
public String str1,str2;
public void Accept()
{
    Scanner sobj = new Scanner(System.in);

    System.out.println("Enter String  :");
    str1 = sobj.nextLine();
}
public void Display()
{
    System.out.println(" String 1 : "+str1);
}
}


class A35_4
{
    public static void main(String arg[])
    {   
       // Scanner sobj = new Scanner (System.in);
        int iSize=0;

        StringDemo strobj = new StringDemo();

        
        strobj.Accept();
        strobj.Display();

        String S = null;
        S = strobj.StrRevTogX();

        System.out.println("Output String : "+S);
        
    }
}