import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in= new Scanner(System.in);
      int n=in.nextInt();
      for(int i=2;i<=n;i++)
      {
        int prime= isprime(i);
        if(prime==1)
          System.out.println(i);
      }
	}
  public static int isprime(int num)
  { int flag=1;
    if (num==2)
      return(flag);
    else
    {
      for(int i=2;i<=num/2;i++)
    {
      if(num%i==0)
      {flag=0;
       break;
      }
      
    }
     return(flag);
  }
}
}