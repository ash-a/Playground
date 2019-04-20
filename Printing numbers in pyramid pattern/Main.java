#include <stdio.h>
int main()
{
    int rows, i, j, number= 1;
    scanf("%d",&rows);

    for(i=1; i <= rows; i++)
    {
      for(int s=1;s<=rows-i;s++)
      {
        printf(" ");
      }
        for(j=1; j <= i; ++j)
        {
            printf("%d ", number);
            ++number;
        }

        printf("\n");
    }

    return 0;
}