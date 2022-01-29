//////////////////////////////////////////////////////////////////////////////////////////
//
//  Prasad R. Bhosale
//  Friday (22/10/2021) (36_5)
//
//  Write a java program which accept number of rows and number of
//  columns from user and display below pattern.
//
//      1  2  3  4
//      5  6  7  8
//      9  10 11 12
//  
//////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Pattern
{
    public void PatternX(int iR, int iC)
    {
        
        int i=0,j=0,X=1;

        for (i=0;i<iR; i++)
        {
            for(j=0; j<iC; j++)
            {   
                System.out.print(" "+X);
                X++;
            }
            System.out.print("\n");
            
        }
    }
}

class A36_5
{
    public static void main(String arg[])
    {
    int iRow=0,iCol=0;
    
    Scanner sobj = new Scanner(System.in);

    System.out.println("Enter Row :");
    iRow = sobj.nextInt();

    System.out.println("Enter Column :");
    iCol = sobj.nextInt();

    Pattern pobj = new Pattern();

    pobj.PatternX(iRow, iCol);

}
}