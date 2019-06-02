package StringBuilder;

public class Wall2Test {
	public static void main(String[] args) {

	Wall2 wall =new Wall2(5,4);
	System.out.println("Area= "+wall.getArea());
	wall.setHeight(-1.5);
	System.out.println("width= " + wall.getWidth());
	System.out.println();
	System.out.println("height= "+ wall.getheight());
	System.out.println("Area: "+wall.getArea());

}

}
