////////////////////////////////////////////////////////////
//
//Prasad R. Bhosale 
//Sunday (12/09/2021)
// wap a program which accept one number from the user and display all its non factors.(8)
//
//////////////////////////////////////////////////////////

#include<stdio.h>

void NonFact(int iNo)
{
int i = 0;
    if(iNo<0)
        {
            iNo = -iNo;
        }
    for (i=2; i<iNo; i++)
        {
        if(iNo%i!=0)
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

NonFact(iValue);
    return 0;
}