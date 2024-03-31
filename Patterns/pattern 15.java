import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int a=sc.nextInt();
	    int star=1;
	    int space=2*a-1;
	    for(int i=1;i<=a;i++){
	        for(int j=1;j<=space;j++){ 
	            System.out.print("  ");
	            }
	            
	       for(int k=1;k<=star;k++){
	   
	           
	                   System.out.print("* ");
	               
	             }
	              
	        
	                   
	                   System.out.println();
	                   star+=2;
	                   space--;
	                   
	       
	     }
	     a--;
	     star=2*a-1;
	     space=0;
	     for(int i=1;i<=a;i++){
	         for(int j=1;j<=star;j++){ 
	            System.out.print("* ");
	            }
	              
	       
	            
	       for(int k=1;k<=space;k++){
	   
	           
	                   System.out.print("   ");
	               
	             }
	              
	        
	                   
	                   System.out.println();
	                   star--;
	                   space+=2;
	                   
	       
	     }
	     
	     
	}
}	