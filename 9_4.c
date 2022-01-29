///////////////////////////////////////////////////////////
//
//Prasad R. Bhosale
//Tuesday (21/09/2021) (9_4)
//Accept number from user and display below pattern.
//
//////////////////////////////////////////////////////////
#include<stdio.h>

void Display(int iNo)
{

int static i,j;
printf("\t#");

for (i =1; i<=iNo;i++)
{

	printf("\t%d",i);
	if(i!=iNo)
	{
	printf("\t*\t#");
	}

}
printf("\t*");
}


int main()
{
int static iValue;
printf("\n Enter No :");
scanf("%d",&iValue);

Display(iValue);


return 0;
}
