//Prasad R. Bhosale
//Saturday (18/09/2021) #(8_1)
//A program which accept range from user and display all numbers in between that range.

#include<stdio.h>

void RangeDisplay(int iStart , int iEnd)
{
int i= 0;
if (iStart<=iEnd)
{
for(i=iStart; i<=iEnd; i++)
{
printf("\t %d",i);
}
}

else
{
printf("Invalid Range");
}
}

int main()
{
int iValue1 = 0,iValue2=0;
double dRet = 0;
printf("\nEnter Starting point :");
scanf("%d",&iValue1);

printf("\nEnter Ending point :");
scanf("%d",&iValue2);

RangeDisplay(iValue1,iValue2);

return 0;
}