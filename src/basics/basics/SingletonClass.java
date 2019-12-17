package basics;

public class SingletonClass {
	
	private static SingletonClass obj = null;
	
	private SingletonClass() {
		
	}

	public SingletonClass getObject() {
		if(obj==null) {
			SingletonClass obj = new SingletonClass();
			return obj;
		}else {
			return obj;
		}
	}
	
	

}
