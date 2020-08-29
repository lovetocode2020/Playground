#include <stdio.h>
int main() {
	//Type your code
  int n,p=0,sum=0,numcopy,num_copy,remainder;
  scanf("%d",&n);
  num_copy=n;
  numcopy=n;
  while(num_copy!=0)
  {
    p=p+1;
    num_copy=num_copy/10;
  }
  while(numcopy!=0)
  { remainder=numcopy%10;
    sum=sum+ pow(remainder,p);
    numcopy=numcopy/10;
  }
  if(n==sum)
    printf("Armstrong Number");
  else
    printf("Not an Armstrong Number");
	return 0;
}