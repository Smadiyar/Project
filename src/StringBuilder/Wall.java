package StringBuilder;

public class Wall {
	
	double width;
	double height;
	
	public Wall() {
		
		
	}
	
	public Wall ( double width, double height) {
		this.height=height;
		this.width=width;
	}
	
	public double getWidth() {
		return width;	
	}
	
	public double getHeight() {
		return height;
	}

	public void setWidth(double width) {
		this.width=width;
		if(width<0) {
			this.width=0;
		}
	}
	public void setHeight(double height) {
		this.height=height;
		if(height<0) {
			this.height=0;
		}
	}
	
	public double getArea() {
		double area=height*width;
		return area;
	}
	
}
