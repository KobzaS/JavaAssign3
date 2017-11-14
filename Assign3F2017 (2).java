import java.util.*;

class Assign3F2017
{
    Accept ac = new Accept();
    Screen sc1 = new Screen();
    int exit = -1; 
    String srch;
    
    public static void main(String[] Args)
    { 
        Screen sc1 = new Screen();
        Assign3F2017 A3 = new Assign3F2017();
        String[] fullName = {"Terri Polo","Lee Majors","Peter Quinn","Terry Palo","Terri Polo","Terri Polo","guinevere shakespeare","Terri Pole","Terry Poly"};
        String[] licensePlate = {"","","","","","","","",""};
        A3.generateLicensePlate(fullName, licensePlate);
        A3.sortArrayAsc(licensePlate, fullName);
        A3.arrayDisplay(licensePlate, fullName);
        
        while (A3.exit == -1){
            int found = A3.binSrch(licensePlate, fullName);
            if (found >= 0)
            {
                System.out.println("Name: " + fullName[found] + " ====> License Plate: " + licensePlate[found]);
                sc1.scrollScreen('+',30,1);
            }
            else if (found == -1)
            {
                System.out.println(A3.srch + " is not found");
                sc1.scrollScreen('+',30,1);
            }
        }
        
    }
    
    public void sortArrayAsc(String LiPl[], String FuNa[])
    {
        String temp, temp2;
        
        for (int LiIndex = 1; LiIndex < LiPl.length; LiIndex++)
        {
           for (int index = 0; index < LiPl.length-1; index++)
           {
              if (LiPl[index].compareTo(LiPl[index+1])>0)
                 {
                 temp = LiPl[index];
                 temp2 = FuNa[index];
                 LiPl[index] = LiPl[index+1];
                 FuNa[index] = FuNa[index+1];
                 LiPl[index+1] = temp;
                 FuNa[index+1] = temp2;
                 }
            }
        }
    }
        
    public void arrayDisplay(String LiPl[], String FuNa[])
    {
        sc1.scrollScreen('=',30,1); 
        System.out.println("License Plate \tFull Name");
        System.out.println("============= \t=========");
        for (int i = 0; i < LiPl.length; i++)
        {
            System.out.println(LiPl[i] + "\t\t " + FuNa[i]);
        }
    }
    
    public int binSrch(String LiPl[], String FuNa[])
    {
        String inp;
        int x = -1;
        System.out.print("Enter the license plate you wish to search for (e or E to exit): ");
        inp = ac.AcceptInputString().toUpperCase().trim();
        srch = inp;
        if (inp.compareToIgnoreCase("e") != 0)
        {
            for (int i = 0; i < LiPl.length; i++)
            {
                if (inp.compareToIgnoreCase(LiPl[i]) == 0)
                {   
                    x = i;
                }
            }
        }
        else
        {
            exit = 0;
            x = -2;
        }
        return x;
    }
    
    public int dupSearch(String LiPl[], String Term)
    {
      int con = 0;
      String Temp;
        for (int x = 0; x < LiPl.length; x++)
        {
            Temp = LiPl[x];
            if (Term.compareTo(Temp) == 0)
            {
                con = 1;
            }
            else if (Term.compareTo(Temp) != 0)
                con = 0;
            
            if (con == 1)
            {
               System.out.println("\t\t\t" + Term + " duplicate license plate, regenerating");
               break;
            }
        }
        return con;
    }
    
    public void generateLicensePlate(String ar[], String lp[])
    {
        Random rand = new Random();
        int a, fourth, sixth;
        char first = 'a', second = 'a', third = 'a', fifth = 'a';
        String tempString = "";
        
        for (int i = 0; i < ar.length; i++)
        {
               tempString = "";
               a = rand.nextInt(3);
               //First license plate character generation
               switch (a){
                  case 0:
                     first = 'X';
                     break;
                  case 1:
                     first = 'Y';
                     break;
                  case 2:
                     first = 'Z';
                     break;
               }
               
               //Second license plate character generation
               second = Character.toUpperCase(ar[i].charAt(0));
                    
               //Third license plate character generation          
               for (int i2 = 0; i2 < ar[i].length(); i2++)
               {
                  if(ar[i].charAt(i2) == ' ')
                  {
                     third = Character.toUpperCase(ar[i].charAt(i2 + 1));
                     break;
                  }
               }
               
               //Fourth & fifth license plate character generation
               if ((ar[i].length() - 1) < 10)
               {
                  fourth = (ar[i].length() - 1);
                  fifth = '0';
               }
               else
               {
                  fourth = ar[i].length()-1;
                  fifth = 'a';
               }
               
               //Sixth license plate character generation
               sixth = (rand.nextInt(3) + 5);
               if (fifth == 'a')
                  tempString = (first + "" + second + "" + third + "" + fourth + "" + sixth);   
               else
                 tempString = (first + "" + second + "" + third + "" + fourth + "" + fifth + "" + sixth);
                 
               //Duplicate plate checking
               if (dupSearch(lp, tempString) == 1)
               {
                  //If duplicate exists go back into same array slot and try again
                  i = i - 1;
               }
               else if (dupSearch(lp, tempString) == 0)
               {
                  //If no duplicate exists assign and print plate
                  lp[i] = tempString;
                  System.out.println(lp[i] + " " + ar[i]);
               }
          }
     }
}