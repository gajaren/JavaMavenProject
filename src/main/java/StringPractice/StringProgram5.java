package StringPractice;

public class StringProgram5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "abc";
		String s2 = new String("abc");
				
		System.out.print(s1==s2);
		System.out.println(s1==s2.intern());
		
		//s1 is in the string pool whereas s2 is created in heap memory. 
		//Hence s1==s2 will return false.

		//When s2.intern() method is called, it checks if there is any string 
		//with value “abc” in the pool. So it returns the reference of s1. 
		//So both s1 and s2 are pointing to same string instance now. 
		// Hence s1==s2.intern() will return true.
	}

}
