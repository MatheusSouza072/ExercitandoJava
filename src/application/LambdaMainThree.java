package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import entities.LambdaProductThree;

public class LambdaMainThree {
	public static void main(String[] args) {

		List<LambdaProductThree> list = new ArrayList<>();

		list.add(new LambdaProductThree("Tv", 900.00));
		list.add(new LambdaProductThree("Mouse", 50.00));
		list.add(new LambdaProductThree("Tablet", 350.50));
		list.add(new LambdaProductThree("HD Case", 80.90));

		List<String> names = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());

		names.forEach(System.out::println);
	}
}
