///////////////////////////////////////////////////////////
//
//  Prasad R. Bhosale
//  Wednesday (29/09/2021) (20_5)
//  Accept division of student from user and depends on that division display exam timing.
//  There are 4 divisions in the school as A,B,C,D. Exam of division A at 7 AM, B at 8:30 AM, 
//  C at 9:20 AM and D at 10:30 AM.(Application should be case insensitive.)
//
//////////////////////////////////////////////////////////
#include <stdio.h>


void DisplaySchedule(char ch)
{
if(ch=='a' || ch=='A')
{
printf("\n Your exam is at 7 AM");
}

else if(ch=='b' || ch=='B')
{
printf("\n Your exam is at 8:30 AM");
}

else if(ch=='c' || ch=='C')
{
printf("\n Your exam is at 9:20 AM");
}

else if(ch=='d' || ch=='D')
{
printf("\n Your exam is at 10:30 AM");
}
else 
{
printf("\n Wrong Input ..!!");
}

}



int main()
{
char cValue= '\0';

printf("\n Enter your division :");
scanf("%c",&cValue);

DisplaySchedule(cValue);


return 0;
}