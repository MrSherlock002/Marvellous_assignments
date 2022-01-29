//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//Prasad R. Bhosale
//Thursday (23/09/2021) (16_1)
// Accept N numbers from user and return difference between summation of even elements and summation of odd numbers.
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////

#include<stdio.h>
#include<stdlib.h>


int Difference (int Arr[],int iLength)
{
int static iSum,i,iSumEven,iSumOdd;
for(i=0;i<iLength; i++)
{
if (Arr[i]%2==0)
{
iSumEven = iSumEven + Arr[i];
}

else
{
iSumOdd = iSumOdd +Arr[i];
}
}
iSum=iSumEven-iSumOdd;
return iSum;
}





int main()
{
int iLength = 0, iRet=0, iCnt=0;
int *p =NULL;

printf("\nEnter No of elements:");
scanf("%d",&iLength);

p=(int*)malloc(iLength*sizeof(int));

if(p==NULL)
{

printf("\nUnable to allocate the memory");
return -1;
}

printf("\n Enter %d elements",iLength);
for(iCnt=0; iCnt<iLength; iCnt++)
{
printf("\n Enter element : %d\n",iCnt+1);
scanf("%d",&p[iCnt]);

}

iRet = Difference(p,iLength);

printf("\n Result is %d",iRet);
free(p);
return 0;
}


