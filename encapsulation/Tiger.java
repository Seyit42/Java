package encapsulation;

public class Tiger extends Animal{
	private static String sound;
	private int height;
	
	
	public static void run() {
		System.out.println("tiger run..");
	}
	public static String getSound() {
		return sound;
	}

	public static void setSound(String sound) {
		Tiger.sound = sound;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	

}
