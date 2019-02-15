public class Pet
{
  private String name;
  private String animal;
  private int age;

  public Pet(String name, String animal, int age)
  {
    this.name = name;
    this.animal = animal;
    this.age = age;
  }

  public Pet()
  {
    this.name = "";
    this.animal = "";
    this.age = 0;
  }

  public void setName(String name)
  {
    name = name;
  }
  public void setAnimal(String animal)
  {
    animal = animal;
  }
  public void setAge(int age)
  {
    age = age;
  }
  public String getName()
  {
    return name;
  }
  public String getAnimal()
  {
    return animal;
  }
  public int getAge()
  {
    return age;
  }
}
