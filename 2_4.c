////////////////////////////////////////////////////////////
//
//Prasad R. Bhosale 
//Sunday (12/09/2021)
// wap a program which accept one character from the user and convert the case of that character.(upper/lower)(4)
//
//////////////////////////////////////////////////////////
#include<stdio.h>

void Display_Convert(char cValue)
{
if(cValue == toupper(cValue))
{
printf("%c",tolower(cValue));
}
else if(cValue == tolower(cValue))
{
    printf("%c",toupper(cValue));
}
}

int main()
{
char cValue = '\0';
printf("Enter Character : \n");
scanf("%c",&cValue);

Display_Convert(cValue);
    return 0;
}