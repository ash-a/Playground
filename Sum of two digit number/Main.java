#include<stdio.h>
int main()
{
   int a,y,x;
  scanf("%d \n",&a);
  y=a%10;
  x=a/10;
  printf("%d\n",x+y);
  return 0;
}