package final_things;

public class InitializationBlocks {

	String initializationVar;

	{
		System.out.println("In initialization block");
		initializationVar = "I'm initialized in initialization block";
	}

	String initializationMethod() {
		System.out.println("In initializationMethod : " + initializationVar);
		initializationVar = "I got changed on initializationMethod";
		return initializationVar;
	}

}
