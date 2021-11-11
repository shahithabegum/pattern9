import java.util.*;
class pattern14	
{
     public static void main(String arg[])
    {
        try{
            int n,i,j;
            Scanner t=new Scanner(System.in);
            System.out.println("Enter n");
            n=t.nextInt();
           for(i = n; i >= 1; i--)
    {
          
        // Inner loop print space
        // for(j = i; j < n; j++)
        // {
          //  System.out.print(" ");
       // }
          
        // Inner loop print star
        for(j = 1; j <=n; j++)
        {
	if(j%2==0)
	  {
                      System.out.print("0");
                    }
	 else{
	     System.out.print("1");
          	   }
	}
        // Ending line after each row
        System.out.println("");
    } 
       }
       catch(Exception e)
	{
	   System.out.println(e);
	 }
       }
}
