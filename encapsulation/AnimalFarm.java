package encapsulation;

public class AnimalFarm {
	public static void main(String[] args) {
		Animal animal = new Animal();
		Tiger tiger = new Tiger();
		animal = tiger;
		Tiger.setSound("wooaaooww");
		Tiger.setSound("hirrrrrr");
		System.out.println(Tiger.getSound() + Animal.getSound());
		tiger.setHeight(5);
		animal.setHeight(12);
		System.out.println(tiger.getHeight() + " " + animal.getHeight());
		Tiger.run();
		Animal.run();
//		System.out.println(" height :" + animal.getHeight());
//		//animal.setName("lion");
//		System.out.println("1.animal: " + animal.getName());
//		animal.setName("tiger");
//		System.out.println("2.animal: " + animal.getName());
//		System.out.println("2.animal: " + animal.getName());
//		animal.setHeight(24); 
//		System.out.println(animal.getHeight());
//		Animal.setAge(5);
//		System.out.println("age:" + Animal.getAge());
//		
//		animal.setName("cat");
//		Animal.setAge(4);
//		System.out.println("Animal's name: " + animal.getName() + ", animal's age:" + Animal.getAge());
	}
	

}
