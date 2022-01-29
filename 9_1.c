///////////////////////////////////////////////////////////
//
//Prasad R. Bhosale
//Tuesday (21/09/2021) (9_1)
//Accept number from user and display below pattern.
//
//////////////////////////////////////////////////////////
#include<stdio.h>

void Display(int iNo)
{
int static i;
for (i =1; i<=iNo;i++)
{

printf("\t%c",i+64);
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
