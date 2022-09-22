//If else: WAP to accept age from user and check eligible for voting or not.

package if_else;
import java.util.Scanner;

public class if_else_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Age:\n");
		num1=sc.nextInt();
		
		if(num1>18)
		{
			System.out.println("You are eligible for voting");
		}
		else
		{
			System.out.println("You are not eligible for voting");
		}
		
		

	}

}
