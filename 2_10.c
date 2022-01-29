////////////////////////////////////////////////////////////
//
//Prasad R. Bhosale 
//Sunday (12/09/2021)
// wap a program which accept one number from the user and return difference between summation of all its factors and non factors.
//
//////////////////////////////////////////////////////////

#include<stdio.h>

int FactDiff(int iNo)
{
int i = 0,iSum = 0;
int iSum1=0,iSum2=0,iDiff=0;
    if(iNo<0)
        {
            iNo = -iNo;
        }
    for (i=1; i<iNo; i++)
        {
        if(iNo%i==0)
            {
                iSum1 = iSum1 + i;  
            }
        else
        {
            iSum2 = iSum2 +i;
        }
        } 
        iDiff = iSum1 - iSum2;
        return iDiff;
}

int main()
{
int iValue = 0;
int iRet = 0;

printf("Even Value : \n");
scanf("%d",&iValue);

iRet = FactDiff(iValue);
printf("\n %d",iRet);
    return 0;
}