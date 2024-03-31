import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int a=sc.nextInt();
	  
	   int count=0;
	    
	    for(int i=2;count<a;i++){
	        int flag=0;
	        for(int j=2;j<count;j++){
	            if(i%j==0){
	                flag=1;
	            }
	        }
	        if(flag==0){
	            System.out.print(i+" ");
	            count++;
	        }
	     }
	}
}	