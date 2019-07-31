package Example1;

import java.util.Scanner;

public class Fibo1 {

	public static void main(String[] args) {
	
		
			 int t1=0,t2=1,t3=1,n=10;   
			 int location =0;
			 int x=0;
			 
			    
			 for(int i=0;i<n;i++)//loop starts from 2 because 0 and 1 are already printed    
			 {    
				 System.out.print(t1+"," );
				 if ( t1==3  ){
						location=i+1;
							 
						 }

				 if (i==4) {
					 
					 x=t1;
					 
				 }
				int sum = t1+t2;
			        t2=t1;
			        t1=sum;
				  
			 }    
			 System.out.println("nth position=" + location); 
			 System.out.println("x value ="+ x);
			}
	
   

	   
   }

		
		
	
	
	

	


