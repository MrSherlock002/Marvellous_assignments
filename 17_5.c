//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//Prasad R. Bhosale
//Friday (24/09/2021) (17_5)
// Accept N numbers from user and accept one another number as NO, return frequency of NO form it. 
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
#include<stdio.h>
#include<stdlib.h>

int Frequency(int Arr[],int iLength,int iNo)
{
int static i,iFreq;
for(i=0; i<iLength; i++)
{
if(Arr[i]==iNo)
{
iFreq++;
}

}
return iFreq;
}

int main()
{
int static iSize,iRet,iCnt,iValue;
int *p= NULL;

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

iRet= Frequency(p,iSize,iValue);

printf("\nFrequency of %d = %d",iValue,iRet);

free(p);

return 0;
}