package final_things;

public class PersonChild extends PersonSuper {

	private String firstName;
	private String lastName;
	
	public PersonChild() {
		super();
	}

	

	public PersonChild(String firstName, String lastName) {
		super(firstName, lastName);

	}

	public String getFirstName() {
		System.out.println("Child First Name getter");
		return firstName;
	}

	public void setFirstName(String firstName) {
		System.out.println("Child First Name setter");
		this.firstName = firstName;
	}

	public String getLastName() {
		System.out.println("Child Last Name getter");
		return lastName;
	}

	public void setLastName(String lastName) {
		System.out.println("Child Last Name setter");
		this.lastName = lastName;
	}
	
	public void getLocationInChildClass() {
		System.out.println(this.getLocation());
	}

}
