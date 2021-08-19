import java.util.Scanner;


public class fibwithrecurision
{

    
     static  int n1=0,n2=1,n3=0;
       
        static void fib(int no){
           if(no>0){
           n3=n2+n1;
           System.out.println("\n "+n3);
           n1=n2;
           n2=n3;
        
       
    
       fib(no-1);}
       }
       
       
    public static void main(String[] args)
       {
       Scanner sc = new Scanner(System.in);
       System.out.println("enter the number of terms to which fibonnaci series is to be obtained");
       
    
       int no=sc.nextInt();
sc.close();
System.out.println( n1+ " \n "+n2);
fib(no-2);

    }}
