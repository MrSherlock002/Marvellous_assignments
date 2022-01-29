//////////////////////////////////////////////////////////////////////////////////////////
//
//  Prasad R. Bhosale
//  Friday (22/10/2021) (36_3)
//
//  Write a java program which accept number of rows and number of
//  columns from user and display below pattern.
//
//      A A A A A
//      B B B B B
//      C C C C C
//  
//////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Pattern 
{
    public void PatternX(int iR, int iC)
    {
        char ch='A';
        int i=0,j=0;
        for (i=0;i<iR; i++)
        {
            for(j=0; j<iC; j++)
            {   
                System.out.print(" "+ch);
            }
            System.out.print("\n");
            ch++;
        }
    }
}

class A36_3
{
    public static void main(String arg[])
    {
    int iRow=0,iCol=0;
    
    Scanner sobj = new Scanner(System.in);

    System.out.println("Enter Row :");
    iRow = sobj.nextInt();

    System.out.println("Enter Col :");
    iCol = sobj.nextInt();

    Pattern pobj = new Pattern();

    pobj.PatternX(iRow, iCol);

}
}