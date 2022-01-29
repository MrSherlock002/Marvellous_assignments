//Prasad R. Bhosale
//Tuesday (14/09/2021)
//A program which accept number from user and return the count of digits in between 3 and 7.(6_3)

#include<stdio.h>

int CountRange(int iNo)
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
if (iDigit > 3 && iDigit < 7)
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

iRet = CountRange(iValue);
printf("Total even digits in given number %d = %d",iValue,iRet);
return 0;
}