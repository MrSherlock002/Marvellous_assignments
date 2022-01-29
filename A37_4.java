//////////////////////////////////////////////////////////////////////////////////////////
//
//  Prasad R. Bhosale
//  Friday (22/10/2021) (37_4)
//
//  Write a java program which accept number of rows and number of
//  columns from user and display below pattern.
//
//        * # * #
//        * # * #
//        * # * #
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
            for(j=0; j<iC; j++)
            {
                if(j%2==0)
                {
                System.out.print(" * ");
                }
                else
                System.out.print(" # ");
            }
            System.out.print("\n");
            
        }
    }
}


class A37_4
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