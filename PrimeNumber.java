import java.util.Scanner;

public class PrimeNumber
{
	public static void main(String arg[])	
	{
              int n,flag=0;
                  
             Scanner sc=new Scanner(System.in);
 
	      System.out.println("Enter the number : ");
              n=sc.nextInt();

		for (int i = 2;i < n;i++) {
		     if (n % i == 0) {
		     	flag = 1;
		     }
		}
               if (flag == 1) {
                    System.out.println("The given Number "+n+" is not prime number");
               } else {
                    System.out.println("The given Number "+n+" is prime number");
               }          
       }
}
