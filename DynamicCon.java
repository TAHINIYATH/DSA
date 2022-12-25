//Dynamic connectivity and quick find 
// there are 3 steps in this Quick find algorithm which is having time complexity O(n)
//step 1: first we connect the nodes 
//step 2: then by using union() function we do more connections
// step 3: finally we check whether the nodes are connected or not 
import java.util.Scanner;
public class DynamicCon
{   
    //int[] arr;
    static int[] arr = new int[100];
    DynamicCon(int nodes)
    {
        for (int i=0;i<nodes;i++)
        {
           arr[i]=i;
        }
    }
public static void main(String[] args)
{
    Scanner sc= new Scanner(System.in);
    System.out.println("hi there");
    System.out.println("this is dynamic connectivity implementation");
    System.out.println("learn and have fun");
    System.out.println("Enter the number of nodes");
    int nodes= sc.nextInt();
    DynamicCon dc= new DynamicCon(nodes);
     for(int j=0;j<nodes/2;j++)
      {
        System.out.println("Enter the 1st node you want to connect"); 
        int a= sc.nextInt();
        System.out.println("Enter the 2st node you want to connect");  
        int b= sc.nextInt();
        dc.union(a,b);
      }
   System.out.println("Enter 2 nodes to check whether they are connected or not");
   int p=sc.nextInt();
   int q=sc.nextInt();
   dc.connected(p, q);
}
void connected(int a, int b)
    {
       if(arr[a]==arr[b])
        System.out.println(a+" and "+b+" are connected");
       else
        System.out.println(a+" and "+b+" are not connected XX");
    }
void union(int a, int b)  
    {  
        if(arr[a]<arr[b])
        { 
            int change1= arr[b];
            for(int i=0;i<10;i++)
            {   
                if(arr[i]==change1)
                arr[i]=arr[a];
               //System.out.println(i+ "  " +arr[i]);
            }
            
        }       
        else
        {
            int change2= arr[a];
            for(int i=0;i<10;i++)//n*n
            {   
                if(arr[i]==change2)
                arr[i]=arr[b];
            }
        }
    }
}

