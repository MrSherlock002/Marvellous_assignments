//////////////////////////////////////////////////////////////////////////////////////////
//
//  Prasad R. Bhosale
//  Sunday (16/10/2021) (31_2)
//
//  Write a java program which accept string from user and count
//  number of small characters.
//  
//////////////////////////////////////////////////////////////////////////////////////////
import java.util.*;

class Marvellous extends StringX
{
public int CountSmall()
{
    int iCnt=0,i=0;
    char Arr[] = str.toCharArray();

    for (i=0; i<Arr.length; i++)
    {
        if((Arr[i]>='a') && (Arr[i]<='z'))
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



class A31_2
{
public static void main(String arg[])
{
    Marvellous mobj = new Marvellous();
    int iRet = 0;
    mobj.Accept();
    mobj.Display();

    iRet = mobj.CountSmall();

    System.out.println("Number of Small letters are : "+iRet);
}
}