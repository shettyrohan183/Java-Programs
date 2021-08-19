import java.util.Scanner;

public class complex {
float x1,x2,y1,y2,real,imag;
Scanner sc=new Scanner(System.in);
complex()
{
  System.out.println("enter the real and imaginary part of first number");
  x1=sc.nextFloat();
  y1=sc.nextFloat();
  System.out.println("enter the real and imaginary part of the second number");
  x2=sc.nextFloat();
  y2=sc.nextFloat();
}
void addcomplex()
{
  real=x1+x2;
  imag=y1+y2;
  System.out.println("the result of addition ="+real+"i("+imag+")");
}
void subcomplex()
{
  real=x1-x2;
  imag=y1-y2;
  System.out.println("the result of subtraction ="+real+"i("+imag+")");
}
void mulcomplex()
{
  real=x1*x2-y1*y2;
  imag=x1*y2+x2*y1;
  System.out.println("the result of multiplication ="+real+"i("+imag+")");
}

}
