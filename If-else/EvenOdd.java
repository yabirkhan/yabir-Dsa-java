import java.util.*;
public class EvenOdd{
		public static void main(String[] args){
				Scanner sc = new Scanner(System.in);
				System.out.print("Enter number of guests: ");
				int n = sc.nextInt();
				if(n%2==0){
						System.out.println("All guest are in pair");
				}
				else{
						System.out.println("Someone is there who is not in pair");
				}
		}
}