#include <stdio.h>
int main() {
	int n,i,count=0;
  scanf("%d\n",&n);
  for(i=1;i<=2*n;i++)
  {
    if(i%2==1)
    {
      printf("%d\n",i);
    }
  }
	return 0;
}