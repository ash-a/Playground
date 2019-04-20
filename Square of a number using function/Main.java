#include<stdio.h>
int s(int n);
int main() {
  int n;
  scanf("%d\n",&n);
  int a;
  a=s(n);
  printf("%d\n",a);
  return 0;
}
   int s(int n)
   {
     return (n*n);
   }
   