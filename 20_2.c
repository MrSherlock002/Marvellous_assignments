///////////////////////////////////////////////////////////
//
//Prasad R. Bhosale
//Wednesday (29/09/2021) (20_2)
//Accept character from user and check whether it is capital or not(A-Z)
//
//////////////////////////////////////////////////////////
#include <stdio.h>
#define TRUE 1
#define FALSE 0

typedef int BOOL;

BOOL ChkCapital(char ch)
{
if(ch>='A' && ch<='Z' )
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

bRet = ChkCapital(cValue);

if(bRet == TRUE)
{
printf("\n Given character %c is a Capital character",cValue);
}
else
{
printf("\n Given character %c is not a Capital character",cValue);
}

return 0;
}