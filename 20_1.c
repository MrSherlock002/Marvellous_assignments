///////////////////////////////////////////////////////////
//
//Prasad R. Bhosale
//Wednesday (29/09/2021) (20_1)
//Accept character from user and check whether it is alphabet or not(A-Z a-z).
//
//////////////////////////////////////////////////////////
#include <stdio.h>
#define TRUE 1
#define FALSE 0

typedef int BOOL;

BOOL ChkAlpha(char ch)
{
if(ch>='a' && ch<='z' || ch>='A' && ch<='Z')
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

bRet = ChkAlpha(cValue);

if(bRet == TRUE)
{
printf("\n It is character");
}
else
{
printf("\n It is not character");
}

return 0;
}