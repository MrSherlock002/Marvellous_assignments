////////////////////////////////////////////////////////////
//
//Prasad R. Bhosale 
//Sunday (12/09/2021)
// wap a program which accept one number from the user and print even factors of that number.(2)
//
//////////////////////////////////////////////////////////

#include<stdio.h>

void Display_Factors(int iNo)
{
int i = 0;
if (iNo <= 0)
{
    if(iNo<0)
        {
            iNo = -iNo;
        }
}
    for (i=1; i<iNo/2; i++)
        {
        if(i<2 || i%2==0 && iNo%i==0)
        //if(iNo%i==0)
            {
                printf("\t%d",i);
                
            }
        }   
}

int main()
{
int iValue = 0;
printf("Even Value : \n");
scanf("%d",&iValue);

Display_Factors(iValue);
    return 0;
}