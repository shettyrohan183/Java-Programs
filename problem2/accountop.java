import java.util.Scanner;


public class accountop
 {

public static void main(String[] args) 
{
		account acc = new account();
		acc.getInput();
		Scanner scan=new Scanner(System.in);
		int i =0;
		
	while(i!=3)
		 {
			System.out.println("\nEnter a choice \n1)Widthdraw \n2)Deposit\n3)Exit\n");
			i=scan.nextInt();

			
			if(i==1)
			{	System.out.println("Enter the amount you want to withdraw\n");
float widthdrawamount=scan.nextFloat();
acc.widthdraw(widthdrawamount);
			}
		else if(i==2)
			{
				System.out.println("Enter the amount you want to deposit\n");
	float depositamount=scan.nextFloat();
				acc.deposit(depositamount );
			
			}


		}
		scan.close();
	}
}
