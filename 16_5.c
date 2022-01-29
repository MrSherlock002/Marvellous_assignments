//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//Prasad R. Bhosale
//Thursday (23/09/2021) (16_5)
// Accept N numbers from user and display all such elements which are multiple of 11.
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
#include<stdio.h>
#include<stdlib.h>


void Display (int Arr[],int iLength)
{
int static i;
for(i=0;i<iLength;i++)
{
if(Arr[i]%11==0)
{
printf("\t %d",Arr[i]);
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


