import java.util.*;



public class Insertionsort
 {
    
public static void main(String args[])
    
{
      
 Scanner sc=new Scanner(System.in);
       
int n=sc.nextInt();
        
int temp,j;
        
int a[]=new int[n];
        
for(int i=0;i<n;i++)
        
{
            
a[i]=sc.nextInt();
        
}
   
        
for(int i=1;i<n;i++)
        
{
            
temp=a[i];
            
j=i-1;
            
while(j>=0&&a[j]>temp)
                
                
{
             
                    
a[j+1]=a[j];
                    
j--;
                
            
}
            
a[j+1]=temp;
        
}
        
for(int i=0;i<n;i++)
        
{
            
System.out.print(a[i]+" ");
        
}


    
}
   
 
}