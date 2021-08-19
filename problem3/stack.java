public class stack
 {
 int top,a[],MAX;
 stack(int n){
   top=-1;
   MAX=n;
   a=new int[MAX];
 }
 
 boolean push(int x)
 {
   if(top==MAX-1)
   {
     System.out.println("stack is full");
 return false;
   }
   else
   {
   a[++top]=x;
   System.out.println(x+ "pushed into the stack");
   return true;
     
   }
 }

int pop()
{
  if(top<0)
  {
    System.out.println("stack is empty");
return -1;
  }
  else
  {
    int x=a[top--];
    return x;
  }
 
}
void display()
{
  System.out.println("elements of the stack are");
  for(int i=0;i<=top;i++)
  {
    System.out.println(a[i]+" ");

  }
  
}
}
