import java.util.Scanner;

public class ReversArray 
{

    public static void main(String[] args) 
	{
    	Scanner sc = new Scanner(System.in);
	  	int length = sc.nextInt();
	   	int[] array = new int[length];
		       
		for (int i = 0; i < length ; i++) 
		{
		        array[i] = sc.nextInt(); 
		}
		for (int i = 0; i < length; i++)
		{
	     		    System.out.print(array[length-i-1] + " ");
		}
  }
		
		
}


