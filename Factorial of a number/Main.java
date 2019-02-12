import java.util.Scanner;
class Main{
	public static void main (String[] args){
        // Type your code here
       Scanner in= new Scanner(System.in);
      int num = in.nextInt();
      int fac = 1;
      for(int count=1; count<=num; count++)
      {
        fac= fac*count;
      }
      System.out.print(fac);
	}
}