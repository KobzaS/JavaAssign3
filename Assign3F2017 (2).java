import java.util.*;




class Assign3F2017
{
    Accept ac = new Accept();
    Screen sc = new Screen();
    public static void main(String[] Args)
    { 
        Assign3F2017 A3 = new Assign3F2017();
        String[] fullName = {"Terri Polo","Lee Majors","Peter Quinn","Terry Palo","Terri Polo","Terri Polo","guinevere shakespeare","Terri Pole","Terry Poly"};
        String[] licensePlate = {"9","8","3","4","5","6","7","8","9"};
        A3.sortArrayAsc(licensePlate, fullName);
        A3.binSrch(licensePlate, fullName);
        A3.arrayDisplay(licensePlate, fullName);
        
        
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
                 System.out.print(LiPl[index]+ " " + LiPl[index+1] + " " + FuNa[index] + " " + FuNa[index+1] + " \n");
                 
                 }
           }
        }
    }
    
    public void arrayDisplay(String LiPl[], String FuNa[])
    {
        for (int i = 0; i < LiPl.length; i++)
        {
            System.out.println(LiPl[i] + " " + FuNa[i]);
        }
    }
    public void binSrch(String LiPl[], String FuNa[])
    {
        String inp;
        int True = 0;
        int x = 0;
        System.out.println("Enter the license plate you wish to search for (e or E to exit): ");
        inp = ac.AcceptInputString();
        if (inp.compareToIgnoreCase("e") != 0)
        {
            for (int i = 0; i < LiPl.length; i++)
            {
                if (inp.compareToIgnoreCase(LiPl[i]) == 0)
                {   
                    True = 1;
                    x = i;
                }
            
            }
            if (True == 1)
            {
                System.out.println("Name: " + FuNa[x] + " ====> License Plate: " + LiPl[x]);
            }
            else
                System.out.println(inp + " is not found");
        }
    }
    public int dupSearch(String LiPl[], String Term)
    {
        for (int x = 0; x < LiPl.length; x++)
        {
            if (term.compareToIgnoreCase(LiPl[i]) == 0)
            {
                System.out.println(Term + " duplicate license plate, regenerating");
                return 1;
            }
            else
                return 0;
        }
    }
    public void generateLicensePlate()
    {
        
    }
}