import java.util.Scanner;
// factorial program
public class fact 
{


	
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int i,fact=1;  
		  int number=sc.nextInt();
		  for(i=1;i<=number;i++)
		  {    
		      fact=fact*i;    
		  }    
		  System.out.println("Factorial of "+number+" is: "+fact); 
	}

}
