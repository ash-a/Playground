#include <stdio.h>
int main() {
	int num,ss,r;
  scanf("%d\n",&num);
  while(num>100)
  {
    r=num%10;
    num=num/10;
  }
  ss=num%10;
  printf("%d\n",ss);
	return 0;
}