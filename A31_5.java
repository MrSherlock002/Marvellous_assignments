//////////////////////////////////////////////////////////////////////////////////////////
//
//  Prasad R. Bhosale
//  Sunday (16/10/2021) (31_5)
//
//  Write a java program which accept string from user and count number of capital characters.
//  
//////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class StringDemo extends StringX
{
    public void Reverse()
    {
        int i=0;
        char Arr[] = str.toCharArray();

        for (i=(Arr.length-1); i>=0; i--)
        {
            System.out.print(Arr[i]);
        }
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



class A31_5
{
public static void main(String arg[])
{
    StringDemo sobjDemo = new StringDemo();

    sobjDemo.Accept();
    sobjDemo.Display();

    sobjDemo.Reverse();
    
}


}