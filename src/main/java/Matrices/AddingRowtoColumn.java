package Matrices;

public class AddingRowtoColumn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int arr2[][]= {{1,2,3},{4,5,6},{7,8,9}};
		
		int[][] arr3=new int[3][3];
		
		//Transpose 2nd matrix
		for (int i=0;i<3;i++) {
			for (int j=0;j<3;j++) {
				arr3[i][j]=arr2[j][i];
				System.out.print(arr3[i][j] + " ");
			}
			System.out.println();
		}
		//Adding rows of first matrix and transpose matrix i.e. column of second matrix
		int[][] arr4=new int[3][3];
		for (int i=0;i<3;i++) {
			for (int j=0;j<3;j++) {
				arr4[i][j]=arr1[i][j]+arr3[i][j];
				System.out.print(arr4[i][j] + " ");
			}
			System.out.println();
		}

	}

}
