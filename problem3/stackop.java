import java.util.Scanner;

public class stackop {

public static void main(String args[])
{
  int i=0;
  Scanner sc=new Scanner(System.in);
  System.out.println("enter the maximum size of the array");
  int size=sc.nextInt();
   stack s =new stack(size);
    
  while(true)
  {
    
  
  
  System.out.println("\n1.push\n2.pop\n3.display\n4.exit  ");
  System.out.print("chose ur option  ");
  i=sc.nextInt();
  switch(i)
  {
    case 1:
    {
      System.out.println("enter the element to be pushed");
      s.push(sc.nextInt());
      break;
    }
    case 2:
    {
      System.out.println(s.pop() +  "is popped");
      break;
    }
    case 3:
    {
      s.display();
      break;
    }
    case 4:System.exit(1); 
  }
  }
  }
  }
