#include<stdio.h>
int main()
{
	int arr_size,num1,num2,i,j,flag1=0,flag2=0;
	scanf("%d",&arr_size);
	int a[arr_size];
	for(i=0;i<arr_size;i++)
	{
		scanf("%d",&a[i]);
	}
	scanf("%d%d",&num1,&num2);
	for(j=0;j<arr_size;j++)
	{
		if(a[j]==num1)
		{
			printf("%d\n",j);
			flag1=1;
			break;
		}
	}
	if(flag1==0)
	{
		printf("-1\n");
	}

	for(j=0;j<arr_size;j++)
	{
		if(a[j]==num2)
		{
			printf("%d\n",j);
			flag2=1;
			break;
		}

	}
	if(flag2==0)
	{
		printf("-1\n");
	}
return 0;
}