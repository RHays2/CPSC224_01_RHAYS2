public class PetTest
{
  public static void main(String[] args)
  {
    Pet myPet = new Pet("Spot", "Dog", 4);
    System.out.println(myPet.getName());
    System.out.println(myPet.getAnimal());
    System.out.println(myPet.getAge());
  }
}
