///////////////////////////////////////////////////////////
//
//Prasad R. Bhosale
//Wednesday (29/09/2021) (20_3)
//Accept character from user and check whether it is digit or not (0-9)
//
//////////////////////////////////////////////////////////
#include <stdio.h>
#define TRUE 1
#define FALSE 0

typedef int BOOL;

BOOL ChkDigit(char ch)
{
if(ch>='0' && ch<='9')
{
return 1;
}
return 0;
}



int main()
{
char cValue= '\0';
BOOL bRet = FALSE;
printf("\n Enter the character :");
scanf("%c",&cValue);

bRet = ChkDigit(cValue);

if(bRet == TRUE)
{
printf("\n Given character %c is a Digit",cValue);
}
else
{
printf("\n Given character %c is not a Digit ",cValue);
}

return 0;
}