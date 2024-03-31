import java.util.*;
public class PalindromeNum {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int n = sc.nextInt();
    int ans = 0;
    int temp = n;
    while(n>0){
        int r = n%10;
        ans = ans*10+r;
        n=n/10;
    }
    if(temp==ans){
        System.out.println("It is a palindrome number");
    }
    else{
        System.out.println("It is not a palindrome number");
    }
  }
}