#include<stdio.h>
int sum(int n);
int main() {
  int num;
  scanf("%d",&num);
  printf("%d",sum(num));
  return 0;
}
  int sum(int n)
  {
   int s=0;
   for(int i=1;i<=n;i++)
   s=s+i;
   return s;
   }