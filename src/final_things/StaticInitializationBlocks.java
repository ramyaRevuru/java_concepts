package final_things;

public class StaticInitializationBlocks {

	private static String statVar;

	private String nonStat;

	private String initializationVar;

	static {
		statVar = "I'm initialized in static block";
		System.out.println("In static initialization block: " + statVar);
	}

	{
		initializationVar = "I'm initialized in initialization block";
		System.out.println(initializationVar);
	}

	public static void main(String[] args) {
		statVar = "I'm static variable.I got changed in main method";
		System.out.println(statVar);
		InitializationBlocks initializationBlocks = new InitializationBlocks();
		initializationBlocks.initializationMethod();
		initializationBlocks.initializationVar = "I'm a initializationVar got Changed in main method of demo class";
		System.out.println(initializationBlocks.initializationVar);
	}

}
