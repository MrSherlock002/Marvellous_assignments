//Prasad R. Bhosale
//Tuesday (14/09/2021)
//A program which accept number from user and return the multiplication of all digits.(6_4)

#include<stdio.h>

int MultDigits(int iNo)
{
int iDigit=0,iCnt =0, iMult=1;
if (iNo == 0)
{
iMult = 0;
return iMult;
}
while(iNo!=0)
{
iDigit = iNo%10;
if (iDigit !=0)
{
iMult = iMult*iDigit; 
}
iNo=iNo/10;
}
return iMult;
}


int main()
{
int iValue = 0,iRet=0;
printf("\n Enter your number :");
scanf("%d",&iValue);

iRet = MultDigits(iValue);
printf("Total multiplication of digits in given number %d = %d",iValue,iRet);
return 0;
}