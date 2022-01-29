//Prasad R. Bhosale
//Tuesday (14/09/2021)
//A program which accept number from user and return the count of even digits.(6_1)

#include<stdio.h>

int CountEven(int iNo)
{
int iDigit=0,iCnt =0;
if (iNo == 0)
{
iCnt++;
return iCnt;
}
while(iNo!=0)
{
iDigit = iNo%10;
if (iDigit%2==0 || iDigit%2==-0)
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

iRet = CountEven(iValue);
printf("Total even digits in given number %d = %d",iValue,iRet);
return 0;
}