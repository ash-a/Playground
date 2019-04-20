#include<stdio.h>
int s(int n,int n1);
int main() {
  int a,b,c;
  scanf("%d%d%d\n",&a,&b,&c);
  int x,y;
  x=s(a,b);
  y=s(x,c);
  printf("%d\n",y);
  return 0;
}
   int s(int n,int n1)
   {
     if(n>n1)
       return n;
     return n1;
   }
   