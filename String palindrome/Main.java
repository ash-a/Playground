#include<stdio.h>
#include<string.h>
int main()
{
  char s1[100];
  gets(s1);
  int k,f;
  k=strlen(s1)-1;
  for(int i=0,j=k;i<(k/2)&&j>(k/2);i++,j--)
  {
    if(s1[i]!=s1[j])
    {
      f=0;
      break;
    }
    f=1;
  }
  if(f==1)
  {
    printf("%s is a palindrome",s1);
  }
  else
  {
    printf("%s is not a palindrome",s1);
  }
}