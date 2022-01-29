//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//Prasad R. Bhosale
//Friday (24/09/2021)  (18_1)
// Accept N numbers from user and accept one another number as NO, check whether NO is present or not.
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
#include<stdio.h>
#include<stdlib.h>

#define TRUE 1
#define FALSE 0

typedef int BOOL;

BOOL Check(int Arr[],int iLength,int iNo)
{
int static i,iFreq;
for(i=0; i<iLength; i++)
{
if(Arr[i]==iNo)
{
return 1;
}

}
return 0;
}

int main()
{
int static iSize,iCnt,iValue;
int *p= NULL;
BOOL bRet = FALSE;

printf("\n Enter Size of elements :");
scanf("%d",&iSize);

printf("\n Enter the Number :");
scanf("%d",&iValue);

p= (int*)malloc(iSize * sizeof(int));

if(p==NULL)
{
printf("\n Unable to allocate memory");
}

printf("\n Enter %d elements",iSize);
for(iCnt = 0; iCnt<iSize; iCnt++)
{
printf("\n Enter element : %d\n",iCnt+1);
scanf("%d",&p[iCnt]);
}

bRet= Check(p,iSize,iValue);

if(bRet == TRUE)
{
printf("\n Number is Present :");
}
else
{
printf("\n Number is not Present :");
}


free(p);

return 0;
}