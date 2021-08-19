import java.util.Scanner;

public class matrix {

public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int sum,rows1,cols1,rows2,cols2;
System.out.println("enter the number of rows and columns in the first matrix ");
rows1 =sc.nextInt();
cols1 =sc.nextInt();
System.out.println("enter the number of rows and columns in the second matrix");
rows2 =sc.nextInt();
cols2 =sc.nextInt();
int a[][]=new int[rows1][cols1];
int b[][]=new int[rows2][cols2];
if(rows1!=cols2)
{
  System.out.println("matrix multiplication is not possible");
  System.exit(1 );
}
  System.out.println("enter the values of first matrix");
  {
  
  for(int i=0;i<rows1;i++)
  {
  for(int j=0;j<cols1;j++)
  {
      a[i][j] =sc.nextInt();
      }
      }
      }
           System.out.println("enter the values of second matrix");
           
    for(int i=0;i<rows2;i++)
    {
    
       for(int j=0;j<cols2;j++)
       {
         
       
       
       b[i][j] =sc.nextInt();
       }
       }
       
       
    int c[][] =new int[rows1][cols2];
    sc.close();
    System.out.println("the resulting matrix will have" +rows1+  "*" +cols2+ "");
    
    
    for(int i=0;i<rows1;i++)
    {   
    
        for(int j=0;j<cols2;j++)
        
        {
        sum=0;
          for(int k=0;k<cols1;k++)
          {
            sum=sum + a[i][k] * b[j][k];
            
          }
          
          c[i][j]=sum;
        }
        
       }
       
    for(int i=0;i<rows1;i++)
    {
      for(int j=0;j<cols1;j++)
      
      System.out.print(c[i][j]+ " ");
      System.out.println();
      
  }
  
}

}
