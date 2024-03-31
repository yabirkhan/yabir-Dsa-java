import java.util.*;
public class CountEvenOddDigit {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int n = sc.nextInt();
    int eCount=0;
    int oCount=0;
    while(n>0){
      int r = n%10;
      if(r%2==0){
        eCount++;
      }
      else{
        oCount++;
      }
      n = n / 10;
    }
    System.out.println("No. of even digits: "+eCount);
    System.out.println("No. of odd digits: "+oCount);
  }
}