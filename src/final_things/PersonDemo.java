package final_things;

public class PersonDemo {

	 static public void main(String[] args) {
		// Get parent class - straight forward
		PersonSuper personSuper = new PersonSuper(null);

		personSuper.getFirstName();

		// Get child class - straight forward
		PersonChild person = new PersonChild(null, null);

		person.getFirstName();

		person.getLocationInChildClass();

		// creating instance of Child class and assigning to reference variable of type
		// parent class. This is called upcasting
		PersonSuper childInstantiation = new PersonChild(null, null);

		// First Name and last Name are overrided in child class. so always child class
		// is used
		childInstantiation.getFirstName();

		// As location method is also inherited.parents value comes
		childInstantiation.getLocation();

		// cannot call child class methods
		//childInstantiation.getLocationInChildClass();
		 
		// not possible because you can cast the object of same type or inherited from
		//Person parentInstantiation=(Person) new PersonSuper(null, null);
		
		// gives run time error. class cast exception.
		//parentInstantiation.getFirstName()

		PersonChildOfChild child=new PersonChildOfChild();
		
		child.getLocationInChildClass();
		

	}

}
