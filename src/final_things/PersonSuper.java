package final_things;

public class PersonSuper {

	public String getFirstName() {
		System.out.println("Parent First Name getter");
		return firstName;
	}

	public void setFirstName(String firstName) {
		System.out.println("Parent First Name setter");
		this.firstName = firstName;
	}

	public String getLastName() {
		System.out.println("Parent Last Name getter");
		return lastName;
	}

	public void setLastName(String lastName) {
		System.out.println("Parent Last Name setter");
		this.lastName = lastName;
	}

	private String firstName;

	private String lastName;

	private String location;

	public String getLocation() {
		System.out.println("Parent Location getter");
		return location;
	}

	public void setLocation(String location) {
		System.out.println("Parent Location setter");
		this.location = location;
	}

	public PersonSuper(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public PersonSuper() {
		super();
	}

	public PersonSuper(String firstName) {
		this.firstName = firstName;
	}

}
