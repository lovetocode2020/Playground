#include <stdio.h>
int main() {
	//Type your code
  int num, sum=0,fact=1,i,numcopy,remainder;
  scanf("%d",&num);
  numcopy=num;
  while(num!=0)
  { remainder=num%10;
   for(i=1;i<=remainder;i++)
   { fact=fact*i;
   }
   sum=sum+fact;
   num=num/10;
   fact=1;
  }
  if(numcopy==sum)
    printf("Yes");
  else
    printf("No");
	return 0;
}