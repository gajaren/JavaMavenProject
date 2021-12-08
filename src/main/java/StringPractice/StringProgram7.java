package StringPractice;

public class StringProgram7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Cat";
		String s2 = "Cat";
		String s3 = new String("Cat");
		        
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		
		//When we use double quotes to create a String, it first looks for String with same value
		//in the String pool, if found it just returns the reference else it creates a new String
		//in the pool and then returns the reference.

		//However using new operator, we force String class to create a new String object in 
		//heap space.

		//So s1 and s2 will have reference to same String in the pool whereas s3 will be a 
		//different object outside the pool, hence the output.
	}

}
