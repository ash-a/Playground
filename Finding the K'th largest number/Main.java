#include<stdio.h>
int main()
{
int n;
  scanf("%d",&n);
  int a[n];
  for(int i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
  }
  int k,temp,i,j;
  scanf("%d",&k);
  for(i=0;i<n;i++)
  {
    for(j=0;j<n;j++)
    {
      if(a[i]>a[j])
      {
        temp=a[i];
        a[i]=a[j];
        a[j]=temp;
      }}}

  printf("%d",a[k-1]);
return 0;
}