
public class WallRun {
	public static void main(String[] args) {
		Wall wall = new Wall();
		Wall wallConstructor = new Wall(1, 2);
		System.out.print("wall ");wallConstructor.getArea();
		
		wall.getArea();
		wall.setHeight(9);
		wall.setWidth(9);
		wall.getArea();
		wall.setHeight(-9);
		wall.setWidth(9);
		wall.getArea();
		wall.getArea();

	}

}
