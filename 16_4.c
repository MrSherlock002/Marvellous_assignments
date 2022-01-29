//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//Prasad R. Bhosale
//Thursday (23/09/2021) (16_4)
// Accept N numbers from user and display all such elements which divisible by 3 and 5.
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
#include<stdio.h>
#include<stdlib.h>


void Display (int Arr[],int iLength)
{
int static i;
for(i=0;i<iLength;i++)
{
if(Arr[i]%5==0 && Arr[i]%3==0)
{
printf("\n %d",Arr[i]);
}
}
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

Display(p,iLength);

free(p);
return 0;
}


