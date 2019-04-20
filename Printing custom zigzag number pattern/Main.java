#include <stdio.h>
int main() {
	int n;
  scanf("%d\n",&n);
  for(int i=1;i<=n;i++)
  {
      if(i%2==1)
      {
  for(int j=1;j<=n;j++)
    {
    if(j==n)
    {
        printf("%d",i+1);
      continue;
    }
    printf("%d",i);
     
     }
      }
    else
    {
      for(int j=1;j<=n;j++)
    {
        if(j==1){
        printf("%d",i+1);
          continue;
        }
        printf("%d",i);
     
     }
    }
    
  
    printf("\n");
  }
	return 0;
}