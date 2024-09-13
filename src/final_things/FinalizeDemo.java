package final_things;

public class FinalizeDemo {
	
	public static void main(String[] args) throws Throwable {
		DemoMainClass demoMain=new DemoMainClass();
		demoMain.finalize();
	}

	

}

class DemoMainClass {
	protected void finalize() throws Throwable {
		String finalVariable = "To garbage collect";

		System.out.println(finalVariable);

		System.gc();

		System.out.println(finalVariable);
		
		super.finalize();
		
		System.out.println(finalVariable);

	}
}
