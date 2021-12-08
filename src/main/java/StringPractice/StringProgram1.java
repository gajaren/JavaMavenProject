package StringPractice;

public class StringProgram1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = new String("pankaj");
		String s2 = new String("PANKAJ");

		System.out.println(s1 = s2);
		
		//It will print “PANKAJ” because the argument inside the println() 
		//function is an assignment. So it will be treated as System.out.println("PANKAJ")
	}

}
