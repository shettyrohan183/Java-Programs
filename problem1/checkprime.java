import java.util.Scanner;
 class checkprime
{

    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System .out.println ("enter the number");
    int no=sc.nextInt();
       int temp=0;
        for(int i=2;i<no-1;i++)
        {
            if(no%i==0){
            
            
             temp=temp+1;
 }
 
 }
 if(temp==0)
 {
 
   
 System .out.println(no+" is a prime number");
 }
           else
           {
       System.out.println (no+" is  not a prime number");
       }
}
}
