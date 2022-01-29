///////////////////////////////////////////////////////////
//
//Prasad R. Bhosale
//Wednesday (29/09/2021) (20_4)
//Accept character from user and check whether it is small case or not (0-9)
//
//////////////////////////////////////////////////////////
#include <stdio.h>
#define TRUE 1
#define FALSE 0

typedef int BOOL;

BOOL ChkSmall(char ch)
{
if(ch>='a' && ch<='z')
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

bRet = ChkSmall(cValue);

if(bRet == TRUE)
{
printf("\n Given character %c is a Small case character",cValue);
}
else
{
printf("\n Given character %c is NOT a Small case character",cValue);
}

return 0;
}