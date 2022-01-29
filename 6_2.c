//Prasad R. Bhosale
//Tuesday (14/09/2021)
//A program which accept number from user and return the count of odd digits.(6_2)

#include<stdio.h>

int CountOdd(int iNo)
{
int iDigit=0,iCnt =0;
if (iNo == 0)
{
return iCnt;
}
while(iNo!=0)
{
iDigit = iNo%10;
if (iDigit%2==1 || iDigit%2 == -1)
{
iCnt++;
}
iNo=iNo/10;
}
return iCnt;
}


int main()
{
int iValue = 0,iRet=0;
printf("\n Enter your number :");
scanf("%d",&iValue);

iRet = CountOdd(iValue);
printf("Total odd digits in given number %d = %d",iValue,iRet);
return 0;
}