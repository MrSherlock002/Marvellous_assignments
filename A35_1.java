//////////////////////////////////////////////////////////////////////////////////////////
//
//  Prasad R. Bhosale
//  Friday (22/10/2021) (35_1)
//
//  Write a java program which accepts 2 strings from user and
//  concat N characters of second string after first string.Value of N
//  should be accepted from user.
//  Note : If third parameter is greater than the size of second string
//  then concat whole string after first string
//  
//////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

class StringDemo extends StringX
{
public String StrNCatX(int iCnt)
{
    int i=0;
    char src[] = str1.toCharArray();
    char dest[] = str2.toCharArray();
    char temp[] = new char[512];

    for(i=0; i<iCnt; i++)
    {
        temp[i]=dest[i];
    }
    
    String S= new String(temp);
    System.out.println("Output : "+str1+" "+S);
    S = str1.concat(S);
    
    return S;
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


class A35_1
{
    public static void main(String arg[])
    {   
        Scanner sobj = new Scanner (System.in);
        int iSize=0;
        System.out.println("Enter size :");
        iSize = sobj.nextInt();

        StringDemo strobj = new StringDemo();

        String S = null;
        strobj.Accept();
        strobj.Display();

        S = strobj.StrNCatX(iSize);
        System.out.println("Output String : "+S);
    }
}