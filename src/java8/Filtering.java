package java8;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Filtering {
	public static void main(String[] args) {
		List<Person> people = DataLoader.getPeople();
		for (Person ppl : people) {
			System.out.print(ppl.getName() + " - " + ppl.getAge() + " , ");
		}
		System.out.println();
		// Filter function to get names above certain age
		List<Person> peopleWithAgeAbove35 = people.stream().filter(obj -> obj.getAge() > 35)
				.collect(Collectors.toList());
		peopleWithAgeAbove35.forEach(obj -> System.out.print(obj.getName() + " - " + obj.getAge() + " , "));

		// Filter function to find all strings that start with a specific letter and
		// collect them into a set.

		Set<Person> filteredSet = people.stream().filter(obj -> obj.getName().startsWith(String.valueOf("Ha")))
				.collect(Collectors.toSet());
		
		for (Person ppl : filteredSet) {
			System.out.print(ppl.getName() + " - " + ppl.getAge() + " , ");
		}
	}
}
