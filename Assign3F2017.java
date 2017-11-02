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
        A3.generateLicensePlate(fullName);
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
    public void generateLicensePlate(String ar[])
    {
        Random rand = new Random();
        int a;
        char b = 'a';
        for (int i = 0; i < ar.length; i++)
        {
            a = rand.nextInt(3);
            switch (a){
               case 0:
                  b = 'X';
                  break;
               case 1:
                  b = 'Y';
                  break;
               case 2:
                  b = 'Z';
                  break;
            }
            System.out.println(b + " ");
        }
        
    }
}