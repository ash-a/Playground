#include <stdio.h>
#include<math.h>
int main() {
	int num,a,n,r,digit=0,sum=0;
  scanf("%d\n",&num);
n=num;
  a=num;
  while(num>0)
  {
    r=num%10;
    digit=digit+1;
    num=num/10;
  }
  while(n>0)
  {
    r=n%10;
    sum=sum+pow(r,digit);
    n=n/10;
  }
  if(sum==a)
  {
    printf("Armstrong Number");
          }
           else
           {
             printf("Not an Armstrong Number");
                    }
           
	return 0;
}