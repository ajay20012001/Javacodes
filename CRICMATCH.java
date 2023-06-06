
import java.util.*;

class match
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0; i<t; i++) {
		    int n = sc.nextInt();
		    int m = sc.nextInt();
		    if(m*36 >= n) {
		        System.out.println("YES");
		    }else {
		        System.out.println("NO");
		    }
		    
		}
		
	}
}
