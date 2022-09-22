//switch case:WAP to Accept character from user and check it is vowel or not

package vowel;
import java.util.Scanner;

public class switch_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 char ch;
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the character:\n");
		 ch=sc.next().charAt(0);
		 
		 if(ch>='a' && ch<='z'|| ch>='A' && ch<='Z')
		  {
		      switch(ch)
		      {
		         case 'a':
		         case 'e':			     
		         case 'i':
		         case 'o':
		         case 'u':
		         case 'A':
		         case 'E':
		         case 'I':
		         case 'O':
				     System.out.println(ch+" is a Vowel");
				     break;
		         default :
		             System.out.println(ch+" is not Vowel it is consonant");
		             break;
		  }
		  }
		  else 
		  {
			  System.out.println(ch+" is not a alphabet");
		  }
		}

}
