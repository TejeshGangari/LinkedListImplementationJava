package basics;

public abstract class SubClass{

	public void methodSuper() {
		System.out.println("Sub Method");
	}
	
	public abstract void absMethod();
	
	public SubClass() {
		System.out.println("Abs Constructor");
	}
}
