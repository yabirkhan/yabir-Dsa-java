import java.util.*;
public class CompareHeight
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.print("Enter height of Ram: ");
		int a = sc.nextInt();
		System.out.print("Enter height of Govind: ");
		int b = sc.nextInt();
		
		if(a>b){
		    System.out.print("Ram is taller");
		}
		else{
		    System.out.print("Govind is taller");
		}
	}
}