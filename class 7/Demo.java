abstract class Animal {
  public String color;
  public String breed;
  public String name;
  abstract void eat();
  public void speak () {
     System.out.println("Animal speaks");
  } 
}
class Dog extends Animal {
  public void eat() {
	  System.out.println("dog eats");
  }
  public void speak() {
	  System.out.println("dog barks");
  
        color = "Black";
        breed = "Germen sheffered";
        name = "Shera";
		System.out.println("colour of Dog is " +color);
		System.out.println("breed od Dod is " +breed);
		System.out.println("name od dog is " +name);
}}

public class Demo {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.eat();
		d.speak();
		}
}