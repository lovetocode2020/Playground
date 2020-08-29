import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner in= new Scanner(System.in);
      int size=in.nextInt();
      int a[]=new int[size];
      for(int i=0;i<size;i++)
      {
        a[i]=in.nextInt();
      }
      int ele1=in.nextInt();
      int ele2=in.nextInt();
      int posi=-1;
      for(int i=0;i<size;i++)
      {
       
        if(a[i]==ele1)
          posi=i;
          
      }
      System.out.println(posi);
      posi=-1;
      for(int i=0;i<size;i++)
      {
        if(a[i]==ele2)
          posi=i;
          
      }
    System.out.println(posi);
      

    }
}