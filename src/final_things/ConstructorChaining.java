package final_things;

public class ConstructorChaining {

	private String stringValue;

	private int intValue;

	private float floatValue;

	private double doubleValue;

	private boolean booleanValue;

	public ConstructorChaining(String stringValue, int intValue, float floatValue, double doubleValue,
			boolean booleanValue) {
		super();
		this.stringValue = stringValue;
		this.intValue = intValue;
		this.floatValue = floatValue;
		this.doubleValue = doubleValue;
		this.booleanValue = booleanValue;
	}

	public ConstructorChaining() {
		this("Default", 0, 0, 0, false);
	}

	public ConstructorChaining(String stringValue) {
		this(stringValue, 0, 0, 0, false);
	}

}
