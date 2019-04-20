#include <stdio.h>
int fact(int n)
{
  int i,fact=1;
  for(int i=1;i<=n;i++)
  {
    fact=fact*i;
  }
  return fact;
}
int main() {
	int num,n,r,digit=0,sum=0;
  scanf("%d\n",&num);
n=num;

  while(num>0)
  {
    r=num%10;
    sum=sum+fact(r);
    num=num/10;
  }
  if(sum==n)
  {
    printf("Yes");
          }
           else
           {
             printf("No");
                    }
           
	return 0;
}