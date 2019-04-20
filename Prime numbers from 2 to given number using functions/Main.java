#include<stdio.h>
int s(int n);
int main() {
  int n;
  scanf("%d\n",&n);
  int a;
  for(int i=2;i<=n;i++)
  {
    a=s(i);
    if(a==1)
      printf("%d\n",i);
    else
      continue;
  }
 
  return 0;
}
   int s(int n)
   {
     int flag=1;
     for(int i=2;i<n;i++)
     {
       if(n%i==0){
         flag=0;
       break;}
       
     }
         return flag;
   }
   