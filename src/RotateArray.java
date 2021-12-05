import java.util.Scanner;

public class RotateArray 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Scanner s= new Scanner(System.in);
        int N = s.nextInt();
        int n = s.nextInt();
        int[] A = new int[N];
        for (int i=0; i<N; ++i) 
        {
            A[i] = s.nextInt();
        }
        System.out.print("orignal array:-");
        for (int i=0; i<N; ++i) 
        {
            System.out.print(A[i]);
        }
        System.out.println("");
        for (int i=0; i<n; ++i) 
        {
            System.out.println(A[i]);
        }
        

	}

	
}
