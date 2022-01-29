//Prasad R. Bhosale
//Saturday (18/09/2021) #(7_2)
//A program which accept width and height of rectangle from user and calculate its area.(Area = Width * Height)

#include<stdio.h>

float RectArea(float fValue1,float fValue2)
{
float fSum;

fSum = fValue1*fValue2;
return fSum;
}


int main()
{
float fValue1 = 0.0,fValue2 = 0.0;
double dRet=0.0;
printf("\n Enter Height :");
scanf("%f",&fValue1);

printf("\n Enter Width :");
scanf("%f",&fValue2);

dRet = RectArea(fValue1,fValue2);

printf("\n Area of rectangle having %f Height and %f Width= %f",fValue1,fValue2,dRet);
return 0;
}