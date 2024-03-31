import java.util.*;
public class MinMaxDigit {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int n = sc.nextInt();
    int min=n%10;
    int max=n%10;
    while(n>0){
        int r = n % 10;
        if(r<min){
            min=r;
        }
        if(r>max){
            max=r;
        }
        n=n/10;
    }
    System.out.println("Smallest digit: "+min);
    System.out.println("Largest digit: "+max);
  }
}