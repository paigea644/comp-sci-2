public class University_Demo
{
   public static void main(String[]args)
   {
      university school = new university ("Georgia College and State University", "GCSU", 99);
      System.out.println(school.toString() + "\n");

      //to print implicitly:
      university school1 = new university ("Georgia College and State University", "GCSU", 99);
      System.out.println("Printing implicitly: \n" + school1);
      
      university student = new university("Paige Elizabeth Adams", "PEA", 18);
      System.out.println("Printing my own info: \n" + student);
      System.out.println("Printing both codes: \n" + school + "\n" + student + "\n");
      System.out.println(school.returnCount());
     
      Print_Rank(school);
      school.RankUpdate(school);
      System.out.println(school);
      
      university school2 = new university("Georgia College and State University", "GCSU", 99);
      university school3 = new university("Florida State University", "FSU", 80);
      //compare objects with ==
      
   }

   public static void Print_Rank(university school)
   {
      int rank = school.getRank();
      System.out.println("Rank: " + rank);
   }
   
   

}