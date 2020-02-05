package encapsulation;

public class Animal {
	private static String sound;
	private String name;
	static int age;
	private int height;
	
	public static void run() {
		System.out.println("animal run...");
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public int getHeight() {
		if (height < 10) {
			System.out.print("pls enter a valid number");
			return -1;
		}else {return height;}
	}
	public void setHeight(int height) {
		this.height = height;
	}
	protected static int getAge() {
		return age;
	}
	protected static void setAge(int age) {
		Animal.age = age;
	}
	public static String getSound() {
		return sound;
	}
	public static void setSound(String sound) {
		Animal.sound = sound;
	}
}
