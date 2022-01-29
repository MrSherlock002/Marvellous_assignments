//////////////////////////////////////////////////////////////////////////////////////////
//
//  Prasad R. Bhosale
//  Wednesday (13/10/2021) (27_1)
//
//  Write a program which checks whether 15th bit is ON or OFF. 
//
//////////////////////////////////////////////////////////////////////////////////////////

#include<stdio.h>

typedef int BOOL;
typedef unsigned int UINT;

#define true 1
#define false 0

BOOL ChkBit(UINT iNo)
{

UINT iMask = 0x00004000;
int iResult = 0;

iResult = iNo & iMask;

if (iResult == iMask)
{
    return true;
}
return false;

}



int main()
{
UINT iValue='\0';
BOOL bRet = false;

printf("\n Enter character : ");
scanf("%d",&iValue);


bRet = ChkBit(iValue);

if(bRet==true)
{
    printf("\n 15th bit is On ");
}
else 
{
    printf("\n 15th bit is OFF ");
}

    return 0;
}
