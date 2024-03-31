import java.util.*;
public class ReverseNum {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int n = sc.nextInt();
    int ans=0;
    while(n>0){
      int r = n%10;
      ans = ans*10 + r;
      n = n / 10;
    }
    n=ans;
    System.out.println("Number after Reverse: "+n);
  }
}