package ExceptionPractice;

public class ExceptionProgram1 {

	public static void main(String[] args) throws NullPointerException{
		// TODO Auto-generated method stub
		int a=20;
		
		try {
			a=a/10;
			throw new NullPointerException("wow");
		}catch(NullPointerException e) {
			System.out.println("runtime" + e);
		}
	}

}
