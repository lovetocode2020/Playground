#include<stdio.h>
  int sq(int n);
int main() {
 int num;
  scanf("%d",&num);
  printf("%d",sq(num));
  return 0;

}
int sq(int n)
{
  int result=n*n;
  return result;
}