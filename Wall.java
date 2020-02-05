
public class Wall {
	private double height;
	private double width;
	Wall(){
		
	}
	Wall(double height, double width){
		if (height < 0) {
			this.height = 0;
		}else {
			this.height = height;
		}
		if (width < 0) {
			this.width = 0;
		}else {
			this.width = width;
		}
		
	}
	
	void getArea() {
		System.out.println(height + "x" + width + " of result: " + height * width);
	}
	public double getHeight() {
		return height;
		
	}
	public void setHeight(double height) {
		if(height < 0) {
			this.height = 0;
		}else {
			this.height = height;
		}
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		if (width < 0) {
			this.width = 0;
		}else {
			this.width = width;
		}
		
	}

}
