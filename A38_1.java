//////////////////////////////////////////////////////////////////////////////////////////
//
//  Prasad R. Bhosale
//  Friday (22/10/2021) (38_1)
//
//  Write a java program which accept number of rows and number of
//  columns from user and display below pattern.
//
//        H e l l o
//        H e l l o
//        H e l l o
//        H e l l o
//  
//////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Pattern 
{
    public void PatternX(int iR, int iC,String str)
    {
        //char Arr[] = new char[30];
        char Arr[] = str.toCharArray();

        int i=0, j=0;

        for(i=1;i<=iR; i++)
        {
            for(j=0; j<iC; j++)
            {
                System.out.print(" "+Arr[j]);
            }
            System.out.print("\n");
            
        }
    }
}


class A38_1
{
    //public static String S;
    public static void main(String arg[])
    {
        int iRow=0, iCol=0;
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String :");
        String S = sobj.nextLine();

        System.out.println("Enter Row :");
        iRow = sobj.nextInt();

        System.out.println("Enter Column :");
        iCol = sobj.nextInt();

        Pattern pobj = new Pattern();

        pobj.PatternX(iRow,iCol,S);
    }


}