#include<stdio.h>
int main()
{
  int a[50],n,b,f=0,g=0,c;
  scanf("%d\n",&n);
  for(int i=0;i<n;i++)
  {
    scanf("%d\t",&a[i]);
  }
  scanf("%d\n",&b);
  scanf("%d\n",&c);
  for(int i=0;i<n;i++)
  {
    if((b==a[i]))
    {
      printf("%d\n",i);
      f=1;
      break;
    }
  }
  if(f!=1)
    printf("-1");
  for(int i=0;i<n;i++)
  {
        if((c==a[i])){
      printf("%d\n",i);
          g=1;
          break;
        }
  }
  if(g!=1){
      printf("-1");
    
  }
  
  return 0;
}