package components;

public class Shell {
	private String type = "rectangular";
	private int width = 100;
	private int height =  100;
	private int length = 100;
	private int diameter = 180;
	
	public Shell(int width, int height, int length){
		this.width = width;
		this.height =  height;
		this.length = length;
		
		type = "rectangular";
	}
	
	public Shell(int diameter, int height){
		this.diameter = diameter;
		this.height =  height;
				
		type = "circular";
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}

	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}

	public int getDiameter() {
		return diameter;
	}
	public void setDiameter(int diameter) {
		this.diameter = diameter;
	}
}
