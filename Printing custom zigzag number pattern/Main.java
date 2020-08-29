#include <stdio.h>
int main() 
{
	int i,j,n;
	scanf("%d",&n);
	for(i=1;i<=n;i++)
	{
		for(j=1;j<=n;j++)
		{
			if(i%2!=0)
			{
				if(j==n)
				{
					printf("%d",++i);
					i=i-1;
				}
				else
				{
					printf("%d",i);		
				}
			}
			else
			{
				if(j==1)
				{
					printf("%d",++i);
					i=i-1;
				}
				else
				{
					printf("%d",i);
				}
			}
		}
		printf("\n");
	}
	return 0;
}
