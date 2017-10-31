import java.util.*;



class Assign3F2017
{
    public static void main(String[] Args)
    { 
        Assign3F2017 A3 = new Assign3F2017();
        String[] fullName = {"Terri Polo","Lee Majors","Peter Quinn","Terry Palo","Terri Polo","Terri Polo","guinevere shakespeare","Terri Pole","Terry Poly"};
        String[] licensePlate = {"9","8","3","4","5","6","7","8","9"};
        A3.sortArrayAsc(licensePlate, fullName);
        
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
           System.out.println ("\n" + FuNa[LiIndex]);
        }
    }
    public void arrayDisplay()
    {

    }
    public void binSrch()
    {

    }
    public void generateLicensePlate()
    {
        
    }
}