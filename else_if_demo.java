//else if: WAP to accept 5 numbers from user and find out the greatest.

package greatest_number;
import java.util.Scanner;

public class else_if_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2,num3,num4,num5;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 5 numbers:\n");
		num1=sc.nextInt();
		num2=sc.nextInt();
		num3=sc.nextInt();
		num4=sc.nextInt();
		num5=sc.nextInt();
		
		if(num1>num2 && num1>num3 && num1>num4 && num1>num5)
		{
			System.out.println("Greatest number is:\n"+num1);
		}
		else if(num2>num1 && num2>num3 && num2>num4 && num2>num5)
		{
			System.out.println("Greatest number is:\n"+num2);
		}
		else if(num3>num1 && num3>num2 && num3>num4 && num3>num5)
		{
			System.out.println("Greatest number is:\n"+num3);
		}
		else if(num4>num1 && num4>num2 && num4>num3 && num4>num5)
		{
			System.out.println("Greatest number is:\n"+num4);
		}
		else
		{
			System.out.println("Greatest number is:\n"+num5);
		}
		
		

	}

}
