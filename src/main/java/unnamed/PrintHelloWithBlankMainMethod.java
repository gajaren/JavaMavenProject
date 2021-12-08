package unnamed;

public class PrintHelloWithBlankMainMethod {
	
	//Print 'Hello world' without using static block or through main method
	
	public static int printString() {
		System.out.println("Hello world");
		return 1;
	}
	
	static int p = printString();
	
	public static void main(String args[]) {
		
	}

}
