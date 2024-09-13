package comparatorNcomparable;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PersonMain {

	public static void main(String[] args) {
		 List<Person> people = Arrays.asList(
		            new Person("Alice", 30),
		            new Person("Bob", 25),
		            new Person("Charlie", 35)
		        );

		        Collections.sort(people); // Sorts using natural ordering (by age)
		        System.out.println(people);

	}

}
