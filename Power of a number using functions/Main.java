#include<stdio.h>
int p(int b,int e);
int main(){
  int b,e;
  scanf("%d%d",&b,&e);
  printf("%d", p(b,e));
  return 0;
}

int p(int b,int e){
int power=1;
while(e>=1)
	{power=power*b;
 	 e--;}
 return power;
}