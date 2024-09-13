package java8;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Grouping {

	public static void main(String[] args) {
		List<Person> persons = DataLoader.getPeople();
		for (Person ppl : persons) {
			System.out.print(ppl.getName() + " - " + ppl.getAge() + " - " + ppl.getDepartment() + " , ");
		}
		System.out.println();
		// Given a list of Person objects, where Person has a getDepartment method, use
		// streams to group the people by their department and collect the result into a
		// map where the key is the department and the value is a list of people in that
		// department.
		Map<String, List<Person>> departments = persons.stream().collect(Collectors.groupingBy(Person::getDepartment));
		System.out.println(departments);
	}

}
