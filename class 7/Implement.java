interface Animal {
  public void Speak();
  public void Eat();
}
class Cat implements Animal {
   public void Speak() {
    System.out.println("Cat speaks miaauunn");
   }
   public void Eat() {
    System.out.println("Cat eat rat");
   }
}
class Dog implements Animal {
     public void Speak() {
	   System.out.println("Dog barks");
	 }
      public void Eat() {
	   System.out.println("Dog eats");
	 }
   }
 class Implement {
   public static void main(String[] args) {
	 Cat c = new Cat();
	 c.Speak();
	 c.Eat();
	 Dog d = new Dog();
	 d.Speak();
	 d.Eat();
   }
  }