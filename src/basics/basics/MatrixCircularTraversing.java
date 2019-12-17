package basics;

import java.util.Scanner;

public class MatrixCircularTraversing {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[][] =  new int[n][n];
		int k=1;
		int C1=0,R1=0;
		int C2=n-1,R2 = n-1;
		
		
		  while(k<=n*n) { for(int i=C1;i<=C2;i++) { a[R1][i]=k++; } 
		  for(int j=R1+1;j<R2;j++) { a[j][C2]=k++;
		  
		  } for(int j=C2-1;j>=C1;j--) { a[R2][j]=k++; } for(int i=R2-1;i>=R1;i--) {
		  a[i][C1]=k++; } C1++; C2--; R1++; R2--; }
		 
		
		/*
		 * while(k<=n*n) { for(int i=c1;i<=c2;i++) { A[r1][i]=k++; }
		 * 
		 * for(int j=r1+1;j<=r2;j++) { A[j][c2]=k++; }
		 * 
		 * for(int i=c2-1;i>=c1;i--) { A[r2][i]=k++; }
		 * 
		 * for(int j=r2-1;j>=r1+1;j--) { A[j][c1]=k++; }
		 * 
		 * c1++; c2--; r1++; r2--; }
		 */

		for(int i=0;i<a.length-1;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(a[i][j]+ "\t");
			}
			System.out.println();
		}
		
		sc.close();
	}

}
