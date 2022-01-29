//Prasad R. Bhosale
//Monday (14/09/2021)
//A program to return reverse number.(1)

#include<stdio.h>

void DisplayDigit(int iNo)
{
if(iNo < 0)
{
iNo=-iNo;
}
int iDigit=0;
while(iNo>0)
{
iDigit = iNo%10;
printf("\t %d",iDigit);
iNo=iNo/10;
}

}

int main()
{
int iValue = 0;
printf("\n Enter your number :");
scanf("%d",&iValue);

DisplayDigit(iValue);
return 0;
}