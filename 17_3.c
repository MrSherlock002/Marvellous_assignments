//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//Prasad R. Bhosale
//Friday (24/09/2021) (17_3)
// Accept N numbers from user and check whether that numbers contains 11 in it or not.
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
#include<stdio.h>
#include<stdlib.h>
#include<stdbool.h>
#define TRUE 1
#define FALSE 0

typedef int BOOL;

BOOL Check(int Arr[],int iLength)
{
int static i;
for(i=0; i<iLength; i++)
{
if(Arr[i]==11)
{
return 1;
}
}

return 0;
}




int main()
{
int static iSize,iRet,iCnt;
int *p =NULL;
BOOL bRet = FALSE;

printf("\n Enter number of elements : ");
scanf("%d",&iSize);

p= (int*)malloc(iSize*sizeof(int));

if(p==NULL)
{
printf("\n Unable to allocate memory");
return -1;
}

printf("\n Enter %d numbers",iSize);
for(iCnt=0; iCnt<iSize; iCnt++)
{
printf("\n Enter Element : %d\n",iCnt+1);
scanf("%d",&p[iCnt]);
}
bRet = Check(p,iSize);

if(bRet==TRUE)
{
printf("\n 11 is present");
}
else
{
printf("]\n 11 is not present");
}

free(p);

return 0;
}