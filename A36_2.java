//////////////////////////////////////////////////////////////////////////////////////////
//
//  Prasad R. Bhosale
//  Friday (22/10/2021) (36_2)
//
//  Write a java program which accept number of rows and number of
//  columns from user and display below pattern.
//
//      A B C D
//      a b c d
//      A B C D
//      a b c d
//  
//////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Pattern 
{
    public void PatternX(int iR, int iC)
    {
        char ch1='A', ch2='a';
        int i=0,j=0;
        for (i=0;i<iR; i++)
        {
            for(j=0; j<iC; j++)
            {   
                if(i%2==1)
                {
                    System.out.print(" "+ch2);
                    ch2++;
                }
                else
                {
                System.out.print(" "+ch1);
                ch1++;
                }
            }
            System.out.print("\n");
            ch1='A';
            ch2 ='a';
        }
    }
}

class A36_2
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