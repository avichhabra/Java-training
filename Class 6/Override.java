class Animal{
   void speak() {
	   System.out.println("Animal speaks");
   }  
  }
 class Dog extends Animal {
     void speak() {
		 System.out.println("Dog Barks");
	 }
 }
class Cat extends Animal {
	void speak() {
	System.out.println("Cat Miaaauuuu");
}	 
}
class Override {
	public static void main(String[] args) {
		Animal a = new Animal();
		a.speak();
		Dog d = new Dog();
		d.speak();
		Cat c = new Cat();
		c.speak();
	}
}