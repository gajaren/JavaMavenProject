package ExceptionPractice;

public class UserDefinedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			throw new MyException("User Defined Exception occured");
		}catch(MyException e){
			System.out.println("Exception:" + e);
		}

	}

}
