//Prasad R. Bhosale
//Saturday (18/09/2021) #(8_3)
//A program which accept range from user and display sum of all numbers in between that range.

#include<stdio.h>

int RangeSum(int iStart , int iEnd)
{
int i= 0,iSum=0;
if (iStart<=iEnd&& iStart>=0)
{
for(i=iStart; i<=iEnd; i++)
{
iSum = iSum + i;
}
return iSum;
}

else
{
printf("Invalid Range");
}
return 0;
}

int main()
{
int iValue1 = 0,iValue2=0;
int static iRet;
printf("\nEnter Starting point :");
scanf("%d",&iValue1);

printf("\nEnter Ending point :");
scanf("%d",&iValue2);

iRet = RangeSum(iValue1,iValue2);
if(iRet!=0)
{
printf("\n Addition is = %d",iRet);
}
return 0;
}