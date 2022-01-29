//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//Prasad R. Bhosale
//Friday (24/09/2021) (17_2)
// Accept N numbers from user and return difference between frequency of even numbers and frequency of odd numbers.
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
#include<stdio.h>
#include<stdlib.h>

int Frequency(int Arr[],int iLength)
{
int static i, iEvenFreq, iOddFreq, iDiff;
for(i=0;i<iLength;i++) 
{

if(Arr[i]%2==0)
{
iEvenFreq++;
}
else
{
iOddFreq++;
}
}
iDiff = iEvenFreq - iOddFreq;
return iDiff;
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

iRet = Frequency(p,iSize);

printf("\n Diffrence between Even Frequency - Odd Frequency = %d\n",iRet);

free(p);

return 0;
}