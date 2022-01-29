///////////////////////////////////////////////////////////
//
//Prasad R. Bhosale
//Tuesday (21/09/2021) (10_4)
//Accept number from user and display below pattern.
//
//////////////////////////////////////////////////////////
#include<stdio.h>

void Display(int iRow,int iCol)
{
int static i,j;
for (i=1; i<=iRow;i++)
{
for(j=1;j<=iCol;j++)
{
if(j%2==0)
{
printf("\t#");
}
else
{
printf("\t*");
}
}
printf("\n");
}

}


int main()
{
int static iValue1,iValue2;
printf("\n Enter Row :");
scanf("%d",&iValue1);

printf("\n Enter Column :");
scanf("%d",&iValue2);

Display(iValue1,iValue2);


return 0;
}
