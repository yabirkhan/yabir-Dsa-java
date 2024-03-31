import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int a=sc.nextInt();
	    int temp=a;
	    int p=1;
	    int num=0;
	    for(int i=2;i<a;i++){
	        
	        for(;temp>0;temp/=10,p*=2){
	            int r=temp%10;
	            num=r*p+num;
	            
	        
	        
	        }
	     }
	               System.out.print(num); 
	}
}	