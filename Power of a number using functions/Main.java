#include<stdio.h>
#include<math.h>
int s(int nb,int e);
int main() {
  int b,e;
  scanf("%d%d\n",&b,&e);
  int a;
  a=s(b,e);
  printf("%d\n",a);
  return 0;
}
   int s(int b,int e )
   {
    return(pow(b,e));
   }
   