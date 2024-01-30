
public class university
{
   private String name;
   private String abbr;
   private int rank;
   private static int count;
   
   public university(String name, String abbr, int rank)
   {
      this.name = name;
      this.abbr = abbr;
      this.rank = rank;
   }
   
   public void setName(String name)
   {
      this.name = name; 
   }
   
   public void setAbbr(String abbr)
   {
      this.abbr = abbr;
   }
   
   public void setRank(int rank)
   {
      this.rank = rank;
   }
   
   public String toString()
   {
      return("name: " + name + "\nabbreviation: " + abbr + "\nrank: " + rank);
   }
   
   private static void byOne()
   {
      count++;
   }
   
   public static int returnCount()
   {
      return count;
   }
   
   public int getRank()
   {
      return rank;
   }
   
   public void RankUpdate(university school)
   {
      rank = rank - 10;
   }
   
   public boolean equals(university school)
   {
      boolean status;
      if (this.getname() == school.getname() && this.getabbr() == school.getabbr() && this.getrank() == school.getrank())
      status = true;
      else 
      status = false; 
   }
   
   
}
//in demo school.print