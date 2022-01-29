//////////////////////////////////////////////////////////////////////////////////////////
//
//  Prasad R. Bhosale
//  Friday (22/10/2021) (36_4)
//
//  Write a java program which accept number of rows and number of
//  columns from user and display below pattern.
//
//      4 4 4 4 4
//      3 3 3 3 3
//      2 2 2 2 2
//      1 1 1 1 1
//  
//////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Pattern
{
    public void PatternX(int iR, int iC)
    {
        
        int i=0,j=0;
        for (i=iR;i>0; i--)
        {
            for(j=0; j<iC; j++)
            {   
                System.out.print(" "+i);
            }
            System.out.print("\n");
            
        }
    }
}

class A36_4
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