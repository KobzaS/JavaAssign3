import java.util.*;

class Assign3F2017
{
    Screen sc1 = new Screen();
    Accept ac1 = new Accept();
    
    public static void main(String args[])
    { 
        Assign3F2017 A3 = new Assign3F2017();
        String fullName[] = {"Terri Polo","Lee Majors","Peter Quinn","Terry Palo","Terri Polo","Terri Polo","guinevere shakespeare","Terri Pole","Terry Poly"};
        String licencePlate[] = {"","","","","","","","",""};
        A3.generateLicensePlate(fullName, licencePlate);
    }
    public void sortArrayAsc()
    {

    }
    public void arrayDisplay()
    {

    }
    public void binSrch()
    {

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
               second = ar[i].charAt(0);
               second = Character.toUpperCase(second);
                  
               for (int i2 = 0; i2 < ar[i].length(); i2++)
               {
                  if(ar[i].charAt(i2) == ' ')
                  {
                     third = ar[i].charAt(i2 + 1);
                     third = Character.toUpperCase(third);
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
                 
               lp[i] = tempString;
               check = dupSearch(lp, tempString);
               
               if (check == 1)
               {
                  lp[i] = "";
                  i = i - 1;
                  System.out.println(tempString + " is a duplicate plate. Creating a new plate.");
               }
               else
               {
                  lp[i] = tempString;
               }
         }
    }
}