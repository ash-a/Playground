#include <stdio.h>
int gcd(int a, int b) 
{ 

    // Everything divides 0  

    if (a == 0) 

       return b; 

    if (b == 0) 

       return a; 

   

    // base case 

    if (a == b) 

        return a; 

   

    // a is greater 

    if (a > b) 

        return gcd(a-b, b); 

    return gcd(a, b-a); 
} 

int main() {
	int x,y,z;
  scanf("%d%d%d\n",&x,&y,&z);
  int m,n;
  m=gcd(x,y);
  n=gcd(m,z);
  printf("%d\n",n);
	return 0;
}