import java.util.Scanner;
 class account
 {
  int accno;
  String name;
  long phno;
  float balanceamt;
  Scanner sc=new Scanner(System.in);
  
  
  void getInput()
  {
    System.out.println("enter the acc holder name");
    name =sc.nextLine();
    System.out.println("enter the account number");
    accno =sc.nextInt();
   System.out.println("enter the acc holder phone number");
   phno=sc.nextLong();
   System.out.println("enter the acc balance amount");
   balanceamt=sc.nextFloat();
   
  }
  
  void deposit(float amount)
  {
  
    balanceamt+=amount;
    System.out.println("deposited"   +amount+  "in the acc");
   System.out.println("current balance=" +balanceamt);
   
   }
  void  widthdraw(float amount)
 {
   if(amount<=balanceamt)
   {
     balanceamt-=amount;
     System.out.println( amount+  "  widthdrawn from the account");
     System.out.println("current acc balance" +balanceamt);
     
   }
   else
   {
     System.out.println("transaction failed due to insufficient balance");
     System.out.println("current acc balance is"+balanceamt);
   }
   }
   }
