//////////////////////////////////////////////////////////////////////////////////////////
//
//  Prasad R. Bhosale
//  Thursday (21/10/2021) (31_4)
//
//  Write a java program which accept string from user and check
//  whether it contains vowels in it or not.
//  
//////////////////////////////////////////////////////////////////////////////////////////
import java.util.*;

class StringDemo extends StringX
{
    public boolean ChkVowel()
    {
        int i=0;
        char Arr[] = str.toCharArray();

        for(i=0; i<Arr.length; i++)
        {
            if((Arr[i]=='a') || (Arr[i]=='A') || (Arr[i]=='e')|| (Arr[i]=='E') || (Arr[i]=='i') || (Arr[i]=='I') || (Arr[i]=='o') || (Arr[i]=='O') || (Arr[i]=='u') ||(Arr[i]=='U'))
            {
                return true;
            }   
        }
        return false;
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


class A31_4
{
    public static void main(String arg[])
    {
        boolean bRet=false;
        StringDemo sobj = new StringDemo();
        sobj.Accept();
        sobj.Display();

        bRet = sobj.ChkVowel();
        if(bRet == true)
        {
            System.out.println("Given string contains Vowel");
        }
        else
        {
            System.out.println("Given string NOT contains Vowel");
        }
    }

}