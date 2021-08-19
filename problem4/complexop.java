import java.util.Scanner;

public class complexop {
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int i=0;
complex c =new complex();
System.out.println("operations on the complex number");
while(true)
{
System.out.println("1.addition\n2.subtraction\n3.multiplication\n");
  System.out.print("enter your choice ");
  i=sc.nextInt();
  switch(i)
  {
    case 1: c.addcomplex();
    break;
    case 2: c.subcomplex();
    break;
    case 3: c.mulcomplex();
    break;
    default: System.exit(1);
  }
  
}

}
}
