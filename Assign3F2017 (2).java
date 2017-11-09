import java.util.*;




class Assign3F2017
{
    Accept ac = new Accept();
    Screen sc1 = new Screen();
    int tTest = 0;
    String srch;
    public static void main(String[] Args)
    { 
        Assign3F2017 A3 = new Assign3F2017();
        String[] fullName = {"Terri Polo","Lee Majors","Peter Quinn","Terry Palo","Terri Polo","Terri Polo","guinevere shakespeare","Terri Pole","Terry Poly"};
        String[] licensePlate = {"","","","","","","","",""};
        A3.generateLicensePlate(fullName, licensePlate);
        A3.sortArrayAsc(licensePlate, fullName);
        A3.arrayDisplay(licensePlate, fullName);
        
        int found = A3.binSrch(licensePlate, fullName);
        if (found >= 0)
        {
            System.out.println("Name: " + fullName[found] + " ====> License Plate: " + licensePlate[found]);
        }
        else
            System.out.println(A3.srch + " is not found");
        
        
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
                 //System.out.print(LiPl[index]+ " " + LiPl[index+1] + " " + FuNa[index] + " " + FuNa[index+1] + " \n");
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
            System.out.println(LiPl[i] + "\t\t \t" + FuNa[i]);
        }
    }
    public int binSrch(String LiPl[], String FuNa[])
    {
        String inp;
        int x = -1;
        System.out.println("Enter the license plate you wish to search for (e or E to exit): ");
        inp = ac.AcceptInputString();
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
        int a, temp, fourth, sixth, check;
        char first = 'a', second = 'a', third = 'a', fifth = 'a';
        String tempString = "";
        boolean chCheck = true;
        
        for (int i = 0; i < ar.length; i++)
        {
               tempString = "";
               a = rand.nextInt(3);
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
                  default:
                     first = 'a';
                     break;
               }
               second = Character.toUpperCase(ar[i].charAt(0));
                                
               for (int i2 = 0; i2 < ar[i].length(); i2++)
               {
                  if(ar[i].charAt(i2) == ' ')
                  {
                     third = Character.toUpperCase(ar[i].charAt(i2 + 1));
                     break;
                  }
                  else
                  {
                     third = 'a';  
                  }
               }
               
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
               sixth = (rand.nextInt(3) + 5);
               if (fifth == 'a')
                  tempString = (first + "" + second + "" + third + "" + fourth + "" + sixth);   
               else
                 tempString = (first + "" + second + "" + third + "" + fourth + "" + fifth + "" + sixth);
               
               check = dupSearch(lp, tempString);
  
               if (dupSearch(lp, tempString) == 1)
               {
                  lp[i] = "";
                  i = i - 1;
               }
               else if (dupSearch(lp, tempString) == 0)
               {
                  lp[i] = tempString;
                  System.out.println(lp[i] + " " + ar[i]);
               }
          }
     }
}