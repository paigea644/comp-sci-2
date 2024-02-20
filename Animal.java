
public class Animal
{
   private int age;
   private String color; 

   public Animal (int age, String color)
   {
      this.age = age;
      this.color = color;
   }
   
   public void setAge(int age)
   {
      this.age= age;
   }
   
   public void setColor(String color)
   {
      this.color= color;
   }

   public int getAge()
   {
      return age;
   }
   
   public String getColor()
   {
      return color;
   }
   
   public String toString()
   {
      return("age: " + age + "color: " + color);
   }
   
   
   public void eat()
   {
      System.out.println("This animal eats food.");
   }
   
   
}
 
 
class Dog extends Animal
{
   private String breed; 
   
   public Dog(String breed, int age, String color)
   {
      super (age, color);
      this.breed = breed; 
   } 

   public void setBreed(String breed)
   {
      this.breed = breed;
   }
   
   public String getBreed()
   {
      return breed;
   }
   
   public static void bark()
   {
      System.out.println("This dog barks!! ruff!");
   }
 
}


class Demo extends Animal
{
    


}