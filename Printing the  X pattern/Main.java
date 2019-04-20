#include <stdio.h>
int main() {
	// Type your code here
  int n;
  scanf("%d\n",&n);
  int k=n;
  for(int i=1;i<=n;i++)
  {
    for(int j=1;j<=n;j++)
    {
    if(i==j)
        printf("*");
     else if(j==k)
        printf("*");
      else{
        printf(" ");
      }
    }
    k--;
    printf("\n");
  }
	return 0;
}