package util;

import java.util.function.Predicate;

import entities.LambdaProductTwo;

public class ProductPredicate implements Predicate<LambdaProductTwo> {

	@Override
	public boolean test(LambdaProductTwo p) {
		return p.getPrice() >= 100.0;
	}
}