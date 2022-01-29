//////////////////////////////////////////////////////////////////////////////////////////
//
//  Prasad R. Bhosale
//  Friday (22/10/2021) (37_3)
//
//  Write a java program which accept number of rows and number of
//  columns from user and display below pattern.
//
//        5 4 3 2 1
//        5 4 3 2 1
//        5 4 3 2 1
//  
//////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

import javax.swing.InputMap;

class Pattern 
{
    public void PatternX(int iR, int iC)
    {
        
        int i=0, j=0;

        for(i=0;i<iR; i++)
        {
            for(j=iC; j>=1; j--)
            {
                System.out.print(" "+j);
            }
            System.out.print("\n");
            
        }
    }
}


class A37_3
{
    public static void main(String arg[])
    {
        int iRow=0, iCol=0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Row :");
        iRow = sobj.nextInt();

        System.out.println("Enter Column :");
        iCol = sobj.nextInt();

        Pattern pobj = new Pattern();

        pobj.PatternX(iRow, iCol);
    }


}