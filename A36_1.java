//////////////////////////////////////////////////////////////////////////////////////////
//
//  Prasad R. Bhosale
//  Friday (22/10/2021) (36_1)
//
//  Write a java program which accept number of rows and number of
//  columns from user and display below pattern.
//
//        A B C D
//        A B C D
//        A B C D
//        A B C D
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
                ch++;
            }
            System.out.print("\n");
            ch='A';
        }
    }
}

class A36_1
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