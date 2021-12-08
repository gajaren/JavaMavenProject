package Inheritance;

public class MainBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Box box=new Box(5.89,5.78);
		BoxWeight boxweight=new BoxWeight("Green");
		
		boxweight.volume();
		box.volume();
		
		//subclass reference is assigned to superclass reference
		box=boxweight;
		
		System.out.println(box);
		System.out.println(boxweight);
		
		boxweight.color="Blue";
		//Below statement is invalid because 'box' does not define 'color'
		//box.color="Red";
		
		//Superclass reference pointing to subclass object. Still can't use 'color' specific to 
		//only subclass.
		Box box1=new BoxWeight("Blue");
		//box1.color();
		

	}

}
