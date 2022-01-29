//Prasad R. Bhosale
//Saturday (18/09/2021) #(7_1)
//A program which accept radius from user and calculate its area. Consider value of pi as 3.14 (Area = PI *RADIUS*RADIUS)  

#include<stdio.h>


double CircleArea(float fRadius)
{
float fSum;
fSum =fRadius * fRadius * 3.14; 

return fSum;
}


int main()
{

float fValue = 0.0;
double dRet=0.0;
printf("\n Enter radius :");
scanf("%f",&fValue);

dRet = CircleArea(fValue);

printf("\n Area of %f radius= %f",fValue,dRet);
return 0;
}