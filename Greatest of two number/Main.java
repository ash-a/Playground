#include<stdio.h>
int main()
{
  //Type your code here
  int num1,num2;
  scanf("%d%d\n",&num1,&num2);
  if(num1>num2)
    printf("num1 is the greatest\n");
  if(num2>num1)
    printf("num2 is the greatest\n");
  if(num1==num2)
    printf("Both are equal\n");
  return 0;
}