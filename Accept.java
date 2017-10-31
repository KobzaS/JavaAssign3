import java.io.*;
import java.util.*;

class Accept
{
   Scanner in = new Scanner(System.in);

   public int AcceptInputInt()  
	{
      return(in.nextInt());
   }       
   
   public char AcceptInputChar()
   {
      return(in.nextLine().charAt(0));
	}
   
   public String AcceptInputString()
   {
      return(in.nextLine());
   }
   
   public float AcceptInputFloat()
   {
      return(in.nextFloat());       
   }
   	
	public double AcceptInputDouble()
	{
	   return(in.nextDouble());	
	}
   
}

