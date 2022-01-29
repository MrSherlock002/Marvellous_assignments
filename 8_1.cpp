//Prasad R. Bhosale
//Saturday (18/09/2021) #(7_5)
//A program which accept area in square and convert it into square meter. (1 square feet=0.0929 square meter)

#include<stdio.h>

double SquareMeter(float fValue)
{
float fSum;
fSum = fValue*0.0929;

return fSum;
}

int main()
{
int iValue = 0;
double dRet = 0;
printf("\nEnter area in square feet:");
scanf("%d",&iValue);

dRet = SquareMeter(iValue);

printf("\n %d Square Feet = %f Square meter",iValue,dRet);
return 0;
}