////////////////////////////////////////////////////////////
//
//Prasad R. Bhosale 
//Sunday (12/09/2021)
// wap a program which accept one number from the user and print that number of even numbers on screen.
//
//////////////////////////////////////////////////////////

#include<stdio.h>

void PrintEven(int iNo)
{
if(iNo <=0 )
{
    iNo = -iNo;
}
int i,p=0;
for(i=0; i<iNo; i++)
{
p = p+2;
printf("\t%d",p);
}

}
int main()
{
int iValue = 0;
printf("Even Value : \n");
scanf("%d",&iValue);

PrintEven(iValue);
    return 0;
}