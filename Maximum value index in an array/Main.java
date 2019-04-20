// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>
// Main function
int main()
{
  // Type your code here 
  int n;
  scanf("%d\n",&n);
  int max=0,p;
  int a[n];
  for(int i=0;i<n;i++)
  {
    scanf("%d\n",&a[i]);
    if(max<a[i])
    {
      max=a[i];
    p=i;
    }
  }
  printf("%d\n",p);
   return 0;
}