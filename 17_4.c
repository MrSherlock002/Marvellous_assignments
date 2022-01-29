//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//Prasad R. Bhosale
//Friday (24/09/2021) (17_4)
// Accept N numbers from user and check return frequency of 11 form it.
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
#include<stdio.h>
#include<stdlib.h>

int Frequency(int Arr[],int iLength)
{
int static i,iFreq;
for(i=0; i<iLength; i++)
{
if(Arr[i]==11)
{
iFreq++;
}

}
return iFreq;
}

int main()
{
int static iSize,iRet,iCnt;
int *p= NULL;

printf("\n Enter Size of elements :");
scanf("%d",&iSize);

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

iRet= Frequency(p,iSize);

printf("\nFrequency of 11 = %d",iRet);

free(p);

return 0;
}