import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner in= new Scanner(System.in);
      int num = in.nextInt();
      int copy = num;
      int digit_count = 0;
      if(num==0)
      {
        System.out.print(num);
      }
      else
      {
        while(num>0)
        {
        digit_count++;
        num=num/10;
        }
      }
      num=copy;
      int sum=0;
      int pow=1;
      while(num>0)
      {
        int rem=num%10;
        for(int countn=1; countn<=digit_count; countn++)
        {
          pow = pow*rem;
        }
        sum= sum+pow;
        pow=1;
        num= num/10;
      }
      if(sum== copy)
      {
        System.out.print("Armstrong Number");
      }
      else
      {
        System.out.print("Not a Armstrong Number");
      }
          
	}
}