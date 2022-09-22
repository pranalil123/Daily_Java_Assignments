//IF:WAP to accept a no from user and display a square if no is divisible by 5.

package if_demo;
import java.util.Scanner;

public class if_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num,res;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:\n");
		num=sc.nextInt();
		
		if(num%5==0)
		{
			res=num*num;
			System.out.println("Square of the given number is:\n"+res);
		}
		
		
	}
	

}
