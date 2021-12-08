package StringPractice;

public class StringProgram6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Java"+1+2+"Quiz"+""+(3+4); 
		
		System.out.println(s);
		
		//First expression in the bracket is executed, then it’s all + operators and get executed from left to right. We get String with each concatenation, hence the output gets produced as shown below.

		//“Java”+1+2+”Quiz”+””+(3+4)
		//“Java”+1+2+”Quiz”+””+7
		//“Java1″+2+”Quiz”+””+7
		//“Java12″+”Quiz”+””+7
		//“Java12Quiz”+””+7
		//“Java12Quiz”+7
		//“Java12Quiz7”

	}

}
