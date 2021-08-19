package problem1;
import java.util.Scanner ;
public class arraybubblesort
{
    public static void main(String[] args){
     
      Scanner sc=new Scanner(System.in);
      System .out.println ("enter the size of array you wany to sort");
    int n=sc.nextInt();
    int[ ] arr=new int[n];
    
    System .out.println ("enter the elements of the array");
      
   {
    for(int i=0;i<n;i++)
    {
        arr[i]=sc.nextInt ();
        
        
    }
    }
       System.out.println("sorrted array is");
      {int temp=0; 
           for(int i=0;i<n;i++)
           
          { 
          int flag=0;
            for(int j=0;j<n-1-i;j++)            
           {
               if(arr[j]>arr[j+1])
               {
               temp=arr[j];
               arr[j]=arr[j+1];
               arr[j+1]=temp;
               flag=1;
               }
           }
           {
           if(flag==0)
           {
            break;
           }
        }
        }
       
       
    {  
    for(int i=0;i<n;i++)
     {
   
    System.out.println(arr[i]);
     }
     }



}
}
}
