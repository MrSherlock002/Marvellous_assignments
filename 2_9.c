////////////////////////////////////////////////////////////
//
//Prasad R. Bhosale 
//Sunday (12/09/2021)
// wap a program which accept one number from the user and return summation of all its non factors.(10)
//
//////////////////////////////////////////////////////////

#include<stdio.h>

int SumNonFact(int iNo)
{
int i = 0,iSum = 0;
    if(iNo<0)
        {
            iNo = -iNo;
        }
    for (i=2; i<iNo; i++)
        {
        if(iNo%i!=0)
            {
                iSum = iSum + i;  
            }
        } 
        return iSum;
}

int main()
{
int iValue = 0;
int iRet = 0;

printf("Even Value : \n");
scanf("%d",&iValue);

iRet = SumNonFact(iValue);
printf("\n %d",iRet);
    return 0;
}