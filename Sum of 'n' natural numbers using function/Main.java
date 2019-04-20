#include<stdio.h>
int s(int ,int);
int main() {
  int n;
  scanf("%d\n",&n);
  int a;
  for(int i=1;i<=n;i++)
  {
 a=s(a,i);
  }
  printf("%d\n",a);
  return 0;
}
   int s(int sum,int n)
   {
     return(sum+n);
   }
   