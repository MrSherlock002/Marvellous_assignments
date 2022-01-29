//Prasad R. Bhosale
//Tuesday (14/09/2021)
//A program which accept number from user and count the frequency of 2 in it.(5_3)

#include<stdio.h>

int CountTwo(int iNo)
{
if(iNo < 0)
{
iNo=-iNo;
}
int iDigit=0,iCnt =0;
while(iNo>0)
{
iDigit = iNo%10;
if (iDigit == 2)
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

iRet = CountTwo(iValue);
printf("%d",iRet);
return 0;
}