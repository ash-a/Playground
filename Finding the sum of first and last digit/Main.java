#include <stdio.h>
int main() {
	int num,ss,r,ss2;
  scanf("%d\n",&num);
  ss2=num%10;
  while(num>100)
  {
    r=num%10;
    num=num/10;
  }
  ss=num/10;
  printf("%d\n",ss+ss2);
	return 0;
}