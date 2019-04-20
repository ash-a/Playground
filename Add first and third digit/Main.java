#include<stdio.h>
int main()
{
  int a,f,y,v;
  scanf("%d\n",&a);
  f=a%100;
  v=f%10;
  y=a/100;
  printf("%d\n",v+y);
  return 0;
}