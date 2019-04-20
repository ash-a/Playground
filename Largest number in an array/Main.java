#include<stdio.h>
int main()
{
  //fill the code
  int n,a[50],num,max=0;
  scanf("%d\n",&n);
  for(int i=0;i<n;i++)
  {
    scanf("%d\t",&a[i]);
  }
  scanf("%d\n",&num);
  for(int i=0;i<n;i++)
  {
    if(max<a[i])
    {
      max=a[i];
    }
  }
  printf("%d",max);
  return 0;
}