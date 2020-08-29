#include <stdio.h>
int greatest_of_2numbers(int n1,int n2) ;
int main()
{int n1,n2,n3;
	scanf("%d%d%d",&n1,&n2,&n3);
 int result=greatest_of_2numbers(n1,n2) ;
 printf("%d",greatest_of_2numbers(result,n3));
	return 0;
}
int greatest_of_2numbers(int n1,int n2) 
{int greatest=0;
  if(n1<n2){
  greatest=n2;}
 else{
   greatest=n1;}
 return greatest;
}
 