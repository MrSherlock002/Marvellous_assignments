////////////////////////////////////////////////////////////
//
//Prasad R. Bhosale 
//Sunday (12/09/2021)
// wap a program which accept one number from the user and display its factors in decreasing order.(7)
//
//////////////////////////////////////////////////////////

#include<stdio.h>

void FactRev(int iNo)
{
int i = 0;
    if(iNo<0)
        {
            iNo = -iNo;
        }
    for (i=iNo/2; i>0; i--)
        {
        if(iNo%i==0)
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

FactRev(iValue);
    return 0;
}