import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		// Type your code here
      Scanner in=new Scanner(System.in);
      int no= in.nextInt();
      int sum=no%10+no/100;
      System.out.println(sum);
	}
}