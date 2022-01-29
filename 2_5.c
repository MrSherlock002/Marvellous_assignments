////////////////////////////////////////////////////////////
//
//Prasad R. Bhosale 
//Sunday (12/09/2021)
// wap a program which accept a character from user and check whether that character is vowel (a,e,i,o,u) or not.(5)
//
//////////////////////////////////////////////////////////
#include<stdio.h>
#include<stdbool.h>

typedef enum{FALSE,TRUE} BOOL;
#define TRUE 1
#define FALSE 0
int ChkVowel(char cValue)
{
if(cValue == 'A' || cValue =='a' ||cValue == 'E' || cValue =='e' ||cValue == 'I' || cValue =='i' ||cValue == 'O' || cValue =='o' || cValue == 'U' || cValue =='u')
{
    return TRUE;
}
else
    {
        return FALSE;
    }
}

int main()
{
char cValue = '\0';
BOOL bRet = FALSE;
printf("Enter Character : \n");
scanf("%c",&cValue);


bRet=ChkVowel(cValue);
if (bRet == TRUE)
{
    printf("It is vowel");
    printf("\nTRUE");
}
else
{
    printf("It is not a vowel");
    printf("\n FALSE");
}
    return 0;
}