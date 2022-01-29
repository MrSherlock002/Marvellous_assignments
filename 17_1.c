//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//Prasad R. Bhosale
//Friday (24/09/2021) (17_1)
// Accept N numbers from user and return frequency of even numbers.
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
#include<stdio.h>
#include<stdlib.h>

int CountEven(int Arr[],int iLength)
{
int static i,iFreq;
for(i=0;i<iLength;i++)
{

if(Arr[i]%2==0)
{
iFreq++;
}
}
return iFreq;
}



int main()
{
int static iSize,iRet,iCnt;
int *p=NULL;

printf("\n Enter number of elements");
scanf("%d",&iSize);

p=(int*)malloc(iSize*sizeof(int));

if(p==NULL)
{
printf("\n Unable to allocate memory");
return -1;
}

printf("\n Enter %d elements",iSize);

for(iCnt=0;iCnt<iSize;iCnt++)
{
printf("\n Enter Element : %d\n",iCnt+1);
scanf("%d",&p[iCnt]);
}

iRet = CountEven(p,iSize);

printf("\n Frequency of even numbers : %d\n",iRet);

free(p);

return 0;
}