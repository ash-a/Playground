#include<stdio.h>
int main()
{
  //Type your code here
  int n;
  scanf("%d\n",&n);
  int a[n],b[n],count=0,k=0;
  for(int i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
    if(a[i]!=0)
    {
      b[k]=a[i];
      count+=1;
      k++;
    }
  }
  for(int i=count;i<n;i++)
    b[i]=0;
  for(int i=0;i<n;i++)
    printf("%d ",b[i]);
  
  
  return 0;
}