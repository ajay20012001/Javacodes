
import java.util.*;
class sqaut
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []arr=new int[n];
	    for(int i=0;i<arr.length;i++)
	    {
	        arr[i]=sc.nextInt();
	      int ans=arr[i]*15;
	      System.out.println(ans);
	       
	    }
		
	}
}
