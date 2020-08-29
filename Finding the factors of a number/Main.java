#include <stdio.h>
int main() {
	//Type your code
  int num,factor;
  scanf("%d",&num);
  for(factor=1;factor<=num;factor++)
  { if (num%factor==0)
     printf("%d\n",factor);
  }
	return 0;
}