#include <stdio.h>
int main() {
	int num,sum,ld,fd;
	scanf("%d",&num);
	ld=num%10;

	while(num>10)
	{
		num=num/10;
		fd=num;
	}
	sum=fd+ld;
	printf("%d",sum);
	return 0;
}