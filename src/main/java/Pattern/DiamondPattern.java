package Pattern;

public class DiamondPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int size=12;
		int odd=1;
		int noOfspces=size/2;
		for (int i=1;i<=size;i++) {
			
			for (int k=noOfspces;k>=1;k--) {
				System.out.print(" ");
			}
			
			for (int j=1;j<=odd;j++) {
				System.out.print("*");
			}
			System.out.println();
			if(i<size/2+1) {
			odd=odd+2;
			noOfspces=noOfspces-1;
			}else {
				odd=odd-2;
				noOfspces=noOfspces+1;
			}
		}
	}

}
