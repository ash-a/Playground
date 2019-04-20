#include<stdio.h>
void main()
{
  int n;
  scanf("%d",&n);
  int a[n],sum2=0;
  for(int i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
    sum2=sum2+a[i];
  }
  int sum;
  int b=n+1;
  sum=(b*(b+1))/2;
  
  
  printf("%d",sum-sum2);
}
  
  