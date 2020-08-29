#include <stdio.h>
int main() {
	int n,num;
  scanf("%d",&n);
  for(num=1;num<=n;num++){
    printf("%d",num);
     if((num%3==0)&&(num!=n)){
      printf(",");}
  }
	return 0;
}