package StringPractice;

public class WithoutSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Nilesh Gajare";
		
		int spaceindex=str.indexOf(" ");
		System.out.println(spaceindex);
		
		String str1=str.substring(spaceindex+1);
		
		System.out.println(str1);
		
		
	}

}
