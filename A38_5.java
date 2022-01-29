//////////////////////////////////////////////////////////////////////////////////////////
//
//  Prasad R. Bhosale
//  Friday (22/10/2021) (38_5)
//
//  Write a java program which accept number of rows and number of
//  columns from user and display below pattern.
//
//      H
//      H e
//      H e l
//      H e l l
//      H e l l o
//      H e l l
//      H e l
//      H e l
//      H e
//      H
//  
//////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Pattern 
{
    public void PatternX(int iR, int iC,String str)
    {
        char Arr[] = str.toCharArray();

        int i=0, j=0;

        for(i=0;i<iR; i++)
        {
            for(j=0; j<=i; j++)
            {
                System.out.print(" "+Arr[j]);
            }
            System.out.print("\n");
            
        }


        for(i=iR;i>0; i--)
        {   
            if(i==iR)
            {
                i--;
            }
            for(j=0; j<i; j++)
            {
                System.out.print(" "+Arr[j]);
            }
            System.out.print("\n");
            
        }
    }
}


class A38_5
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