///////////////////////////////////////////////////////////
//
//Prasad R. Bhosale
//Tuesday (21/09/2021) (9_2)
//Accept number from user and display below pattern.
//
//////////////////////////////////////////////////////////
#include<stdio.h>

void Display(int iNo)
{
int static i;
for (i =iNo; i>=1;i--)
{

printf("\t%d\t#",i);
}

}


int main()
{
int static iValue;
printf("\n Enter No :");
scanf("%d",&iValue);

Display(iValue);


return 0;
}
