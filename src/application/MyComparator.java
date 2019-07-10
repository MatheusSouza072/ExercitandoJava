package application;

import java.util.Comparator;

import entities.LambdaProduct;

public class MyComparator implements Comparator<LambdaProduct> {

	@Override
	public int compare(LambdaProduct p1, LambdaProduct p2) {
		return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
	}
}