#include <stdio.h>
int main() {
	int num,fact=1;
  scanf("%d\n",&num);
  for(int i=1;i<=num;i++)
  {
    fact=fact*i;
  }
  printf("%d\n",fact);
	return 0;
}