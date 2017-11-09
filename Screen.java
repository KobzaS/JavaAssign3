public class Screen
{
   public static void scrollScreen(int numscroll)
   {
      for (int i = 0; i < numscroll; i++)
      {
         System.out.println("");         
      }   
   }

   public static void scrollScreen(char displaychar, int numchar, int numline)
   { 
	   for (int a = 0; a < numline; a++) 
      {
        //System.out.println("");
        for (int b = 0; b < numchar; b++) 
        {
           System.out.print(displaychar);
        }       
      }
   System.out.println("");
	}     
}
