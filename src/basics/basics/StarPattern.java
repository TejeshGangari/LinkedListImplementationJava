package basics;

public class StarPattern {
	
	public static void main(String args[]) {
		printPattern(4);
	}
	
	static void printPattern(int size) {
		
		for(int i=1;i<size;i++) {
			for(int j=0;j<i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}	
		for(int i=size;i>0;i--) {
			for(int j=i;j>0;j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
