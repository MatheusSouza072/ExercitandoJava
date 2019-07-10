package application;

import java.util.ArrayList;
import java.util.List;

import entities.LambdaProductTwo;

public class LambdaMainTwo {
	public static void main(String[] args) {

		List<LambdaProductTwo> list = new ArrayList<>();

		list.add(new LambdaProductTwo("Tv", 900.00));
		list.add(new LambdaProductTwo("Mouse", 50.00));
		list.add(new LambdaProductTwo("Tablet", 350.50));
		list.add(new LambdaProductTwo("HD Case", 80.90));

		double min = 100.0;

		list.removeIf(p -> p.getPrice() >= min);

		for (LambdaProductTwo p : list) {
			System.out.println(p);
		}
	}
}