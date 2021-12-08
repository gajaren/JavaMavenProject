package Inheritance;

public class Box {
	
	double height;
	double width;
	
	Box(){
		height=-1;
		width=-1;
	}
	
	Box(double height,double width){
		this.height=height;
		this.width=width;
	}
	
	public double volume() {
		return height*width;
	}

}
