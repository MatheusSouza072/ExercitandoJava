package application;

import java.util.ArrayList;
import java.util.List;

import entities.LambdaProduct;

public class LambdaMain {

	public static void main(String[] args) {

		List<LambdaProduct> list = new ArrayList<>();

		list.add(new LambdaProduct("TV", 900.00));
		list.add(new LambdaProduct("Notebook", 1200.00));
		list.add(new LambdaProduct("Tablet", 450.00));

		list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));

		for (LambdaProduct p : list) {
			System.out.println(p);
		}
	}
}