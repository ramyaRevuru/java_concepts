package java8;

import java.util.List;
import java.util.stream.Collectors;

public class Mapping {

	public static void main(String[] args) {
		List<Person> people = DataLoader.getPeople();
		for (Person ppl : people) {
			System.out.print(ppl.getName() + " - " + ppl.getAge() + " , ");
		}
		System.out.println();
		/**
		 * Given a list of strings representing names, use streams to convert each name
		 * to uppercase and collect the results into a list.
		 */
		List<String> peopleFilter = people.stream().map(obj -> obj.getName().toUpperCase())
				.collect(Collectors.toList());
		for (String name : peopleFilter) {
			System.out.print(name + " ");
		}
		System.out.println();
		/**
		 * Given a list of Person objects, where Person has a getAge method, use streams
		 * to extract all ages and collect them into a list.
		 */
		List<Integer> ageList = people.stream().map(obj -> obj.getAge()).collect(Collectors.toList());
		System.out.println(ageList);
	}

}
