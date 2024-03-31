import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int a1=1,a2=2,a3=3,a4=4,a5=5,a6=6,a7=7,a8=8,a9=9;
        
         
        
       for(int i=1;i<=a;i++){
            for(int j=1;j<=a;j++){
             if(j==5||j==9||i==5||i==9){
                 System.out.print("* ");
             }
             else if(i==3&&j==3){
                 System.out.print(a1+" ");
             }
             else if(i==3&&j==7){
                 System.out.print(a2+" ");
             }
             else if(i==3&&j==11){
                 System.out.print(a3+" ");
             }
             else if(i==7&&j==3){
                 System.out.print(a4+" ");
             }
             else if(i==7&&j==7){
                 System.out.print(a5+" ");
             }
             else if(i==7&&j==11){
                  System.out.print(a6+" ");
             }
             else if(i==11&&j==3){
                  System.out.print(a7+" ");
             }
             else if(i==11&&j==7){
                  System.out.print(a8+" ");
             }
             else if(i==11&&j==11){
                  System.out.print(a9+" ");
             }
             else{
                 System.out.print("  ");
             }
             
            }
                         System.out.println();
                         
        }

            
        
         
        }
             
        
    
}