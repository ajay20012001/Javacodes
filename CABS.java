

import java.util.*;
class Solution
{
	public static void main (String[] args) throws java.lang.Exception
	{
		  
		    Scanner kc = new Scanner(System.in);
	      	int t = kc.nextInt();
	    
	         while(t>0){
		         t--;
		      int a=kc.nextInt();
		      int b=kc.nextInt();
		         if(a==b){
		        System.out.println("ANY");
		         }
		         else if(a<b){
		        System.out.println("FIRST");
		        }
		         else{
		        System.out.println("SECOND");
		        }
		
		}

			
	}
}
