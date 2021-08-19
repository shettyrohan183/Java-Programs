
import java.util.Scanner;
public class fibwithoutrec
{
    public static void main(String[] args) {
       int n1,n2,n3,no;
       n1=0;
       n2=1; 
       System.out.println("enter the nth term to which fibonnaci series is to be obtained");
       Scanner sc = new Scanner(System.in);
       no=sc.nextInt();
       System.out.println (n1+"\n"+n2);
       for(int i=1;i<no;i++)
       {
           n3=n2+n1;
           System.out.println(n3);
           n1=n2;
           n2=n3;
       }
    }
}
