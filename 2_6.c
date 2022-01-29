////////////////////////////////////////////////////////////
//
//Prasad R. Bhosale 
//Sunday (12/09/2021)
// wap a program which accept one number from the user and display its multiplication of factors.(6)
//
//////////////////////////////////////////////////////////
#include<stdio.h>

int i,iMult=1;
int MultiFact(int iNo)
{
    for(i=1;i<iNo;i++)
    {
        if(iNo%i==0)
        {
            iMult = iMult * i;
        }
    }
    return iMult;
}

int main()
{
int iValue = 0;
int iRet = 0;
printf("Enter number :");
scanf("%d",&iValue);

iRet = MultiFact(iValue);

printf("%d",iRet);

return 0;
}