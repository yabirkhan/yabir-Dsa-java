

import java.util.*;

 public class first and last no{


    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("kindly enter a value");
        int n =sc.nextInt();
        int r=0;
        int l=0;
        while(n>0){
            l=n%10;
            r = n%10;
            n=n/10;

        }
        System.out.println("the first digite is "+l+"the last digite no se"+r);
    }
 }