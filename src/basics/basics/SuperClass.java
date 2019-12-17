package basics;

public class SuperClass extends SubClass{

	public void methodSuper() {
		System.out.println("Super Method");
	}

	@Override
	public void absMethod() {
		System.out.println("Super Class - Abs Method");
		
	}
}
