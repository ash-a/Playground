#include<stdio.h>
int main()
{
int n;
  scanf("%d",&n);
  int a[n];
  int k,i,j;
  scanf("%d",&k);
  int b[k];
  for(int i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
  }
int x=1;
  
for(j=0;j<k;j++)
    {
  b[j]=0;
  for(i=0;i<n;i++)
  {
      if(a[i]==x)
      {
        b[j]=b[j]+1;
      }
  }
  x++;
  
}
  for(int m=0;m<k;m++)
  {
    printf("%d %d\n",m+1,b[m]);
  }
return 0;
}