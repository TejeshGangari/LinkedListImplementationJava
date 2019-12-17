package basics;

public class StarPattern2 {

	/**
	 * 
	 * @param args
	 */
	public static void main(String args[]) {
		patternDesing(5);
	}
	
	static void patternDesing(int size) {
		
		for(int i=1;i<=size;i++) {
			for(int j=1;j<=size;j++) {
				if(i==j) {
					System.out.print("*");
				}else if(i+j==size+1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
		
	}
}
