package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class stream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> numbers = new ArrayList<Integer>();

		for (int i = 101; 100 < i && i < 999; i++) {

			numbers.add(i);

		}

		System.out.println(numbers);

		numbers.stream().forEach(System.out::println);

		numbers.stream().map(i -> i * 2).forEach(System.out::println);

		List<Integer> timesTenNumbers = numbers.stream().map(i -> i * 10).collect(Collectors.toList());
		System.out.println(timesTenNumbers);

	}

}
