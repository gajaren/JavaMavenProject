package StringPractice;

public class StringProgram3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = null;
		System.out.println(s1); 
		System.out.println(s1.toString());
		
		//Line 3 will throw NullPointerException 
		//because we are trying to invoke toString() function on null.
	}

}
