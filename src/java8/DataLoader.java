package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DataLoader {
	private static final String[] NAMES = { "Alice", "Bob", "Charlie", "Diana", "Edward", "Fiona", "George", "Hannah",
			"Isaac", "Jack", "Karen", "Leo", "Mia", "Nathan", "Olivia", "Paul", "Quinn", "Rachel", "Sam", "Tina",
			"Ursula", "Victor", "Wendy", "Xander", "Yara", "Zach", "Anna", "Brian", "Clara", "David", "Eva", "Frank",
			"Grace", "Henry", "Ivy", "James", "Kelsey", "Liam", "Mona", "Nina", "Oscar", "Penny", "Quincy", "Ryan",
			"Sophia", "Tom", "Uma", "Vera", "Will", "Xena" };

	private static final String[] DEPARTMENTS = { "Human Resources", "Engineering", "Marketing", "Sales", "Finance" };

	private static final Random RANDOM = new Random();

	public static List<Person> getPeople() {
		List<Person> people = new ArrayList<>();
		for (int i = 0; i < 50; i++) {
			int age = RANDOM.nextInt(60) + 18; // Random age between 18 and 77
			people.add(new Person(NAMES[RANDOM.nextInt(NAMES.length)], age,
					DEPARTMENTS[RANDOM.nextInt(DEPARTMENTS.length)]));
		}
		return people;
	}
}
