//Prasad R. Bhosale
//Saturday (18/09/2021) #(7_3)
//A program which accept distance in kilometer and convert it into meter.(1 Kilometer = 1000 Meter)

#include<stdio.h>

int KMtoMeter(int iValue)
{
int iSum = 0;
iSum = iValue*1000;

return iSum;
}


int main()
{
int iValue = 0,iRet = 0;
printf("\nEnter Distance :");
scanf("%d",&iValue);

iRet = KMtoMeter(iValue);

printf("\n %d Kilometer = %d Meters",iValue,iRet);
return 0;
}